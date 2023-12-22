
import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long K=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		for(int i=(int) A;i<=B;i++) {
			if(i%K==0) {
				System.out.println("OK");
				System.exit(0);
			}
		}
		System.out.println("NG");

		}
}
