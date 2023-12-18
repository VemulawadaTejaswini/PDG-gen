import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int D=stdIn.nextInt();
		int X[][]=new int[N][D];
		double a=0;
		int z=0,y=0,x=0,ans=0;
		while(z<N){
			while(y<D){
				X[z][y]=stdIn.nextInt();
				y++;
			}y=0;
			z++;
		}z=0;
		while(z<N){
			y=z+1;
			while(y<N){
				while(x<D){
					a+=(X[z][x]-X[y][x])*(X[z][x]-X[y][x]);
					x++;
				}x=0;
				double c=Math.sqrt(a);
				int b=(int)c;
				if(b*b==a)
					ans++;
				a=0;
				y++;
			}
			z++;
		}
		System.out.println(ans);
	}
}