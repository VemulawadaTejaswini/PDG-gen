import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		long ans=B;
		for(int i=A;i!=1;i--) {
			ans*=B-1;
		}
		System.out.println(ans);
	}
}