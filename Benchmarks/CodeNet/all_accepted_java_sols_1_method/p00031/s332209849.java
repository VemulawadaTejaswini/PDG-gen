import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n[]=new int[10];
		boolean m[]=new boolean[10];
		int i,j,x,k=2,tmp;
		
		n[0]=1;
		for(i=1;i<10;i++){
			n[i]=k;
			k=2*k;
		}
		
		while(s.hasNext()){
			Arrays.fill(m, false);
			x=s.nextInt();
			tmp=x;
			for(i=i-1;i>=0;i--){
				if(tmp>=n[i]){
					m[i]=true;
					tmp-=n[i];
				}
			}
			boolean f=true;
			for(i=0;i<10;i++){
				if(m[i]){
					if(!f){
						System.out.print(" ");
					}
					f=false;
					System.out.print(n[i]);
				}
			}
			System.out.println();
		}
	}

}