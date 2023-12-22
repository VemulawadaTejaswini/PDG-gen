import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer =0;
		if(n ==1) {
			System.out.println(1);
			return;
		}
		long l0 =2;
		long l1 =1;
		for(int i =2;i <=n;i++) {
			answer = l0 + l1;
			l0 =l1;
			l1 = answer;
		}
		System.out.println(answer);

	}
}