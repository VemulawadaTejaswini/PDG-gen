import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int T=sc.nextInt();
		sc.close();

		int cnt=T/A;
		int ans=B*cnt;

		System.out.println(ans);

	}
}