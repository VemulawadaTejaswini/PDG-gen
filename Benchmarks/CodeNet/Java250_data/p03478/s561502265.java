import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int z=1,y=0,x=0,ans=0;
		while(z<=N){
			y=z;
			while(true){
				x+=y%10;
				y/=10;
				if(y==0)
					break;
			}
			if(A<=x&&B>=x)
				ans+=z;
			x=0;
			z++;
		}
		System.out.println(ans);
	}
}