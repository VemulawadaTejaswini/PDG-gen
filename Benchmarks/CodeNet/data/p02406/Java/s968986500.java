import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=0;
		int sw=0; 
		for (int c=1;c<=a;c++){
			b++;
			
			if (b%3==0 || b%10==3){
				sw=1;
			}
			
			if (b>10){
				int d=b;
					d/=10;
					if (d%3==0 || d%10==3){
						sw=1;
					}
				if(b>100){
					d/=10;
					if (d%3==0 || d%10==3){
						sw=1;
					}
				}
				if(b>1000){
					d/=10;
					if (d%3==0 || d%10==3){
						sw=1;
					}
				}
			}
			if (sw==1){
				System.out.print(" "+c);
			}
			sw=0;
		}
		System.out.println();
	}
}