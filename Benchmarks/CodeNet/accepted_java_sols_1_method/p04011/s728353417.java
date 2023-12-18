import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int X=scan.nextInt();
		int Y=scan.nextInt();
		int total;

		if(N<=K){
			total=N*X;
		}else{
			total=K*X+(N-K)*Y;
		}
		System.out.println(total);
	}
}