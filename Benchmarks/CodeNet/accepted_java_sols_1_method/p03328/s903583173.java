
import java.util.Scanner;
public class Main {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=B-A;
		int cnt=0;
		for(int i=1;i<=C;i++) {
			cnt+=i;
		}
		System.out.println(cnt-B);

	}
}