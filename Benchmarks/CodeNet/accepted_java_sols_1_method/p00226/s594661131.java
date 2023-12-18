import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int a1 = stdIn.nextInt();
			int b1 = stdIn.nextInt();
			if(a1==0&&b1==0){
				return;
			}
			int[] a2 = new int[4];
			int[] b2 = new int[4];
			a2[0]=a1/1000;
			a1-=a2[0]*1000;
			a2[1]=a1/100;
			a1-=a2[1]*100;
			a2[2]=a1/10;
			a2[3]=a1%10;
			b2[0]=b1/1000;
			b1-=b2[0]*1000;
			b2[1]=b1/100;
			b1-=b2[1]*100;
			b2[2]=b1/10;
			b2[3]=b1%10;
			int hit=0, blow=0;
			for(int i=0;i<4;i++){
				if(a2[i]==b2[i]){
					hit++;
				}
			}
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i!=j&&a2[i]==b2[j]){
						blow++;
					}
				}
			}
			System.out.println(hit+" "+blow);
		}	
	}
}