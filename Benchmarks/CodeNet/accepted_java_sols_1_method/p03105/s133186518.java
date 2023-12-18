import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		if(A > B) {
			System.out.println(0);
		}else {
			int cnt = 0;
			int num = B;
			while(cnt < C) {
				num -= A;
				cnt++;
				if(num < A) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}