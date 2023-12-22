import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		double a=0,ans=0,z=0;
		while(z<N){
			a=stdIn.nextDouble();
			ans+=1/a;
			z++;
		}
		System.out.println(1/ans);
	}
}