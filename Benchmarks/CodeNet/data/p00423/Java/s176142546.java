import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] a=new int[100];
		int[] b=new int[100];
		int[] n=new int[20];
		int ansA=0;
		int ansB=0;
		int k=0;
		int h=0;
		int a1=0;
		int b1=0;
		
		Scanner scan = new Scanner(System.in);
		while(true){
			int in =scan.nextInt();
			if(in==0)
				break;
			n[h]=in;
			h++;
			for (int i = 0; i < 2*in; i++) {
				if(i%2==0){
					a[a1]=scan.nextInt();
					a1++;
				}else{
					b[b1]=scan.nextInt();
					b1++;
				}
			}
			//System.out.println(scan.nextInt());
		}
	
		k=0;
		for(int j=0;j<20;j++){
			if(n[j]==0)
				break;
			
			for (int i = k; i <k+n[j]; i++) {
				if(a[i]>b[i])
					ansA=ansA+a[i]+b[i];
				else if(a[i]<b[i])
					ansB=ansB+a[i]+b[i];
				else{	
					ansA=ansA+a[i];
					ansB=ansB+b[i];
				}
				h=i;
				//System.out.println(""+a[i]+" "+b[i]);
			}
			k=h+1;
			
			System.out.println(""+ansA+" "+ansB);
			ansA=0;
			ansB=0;
		}		
	}
}