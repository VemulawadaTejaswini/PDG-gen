import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int cnt = 1;
		for (int i = 0;;i++) {
			if(A == 4 || A == 2 || A == 1) {
				break;
			}
			if(A % 2 == 0) {
				A = A / 2;
				cnt = cnt + 1;
			}else {
				A = (A * 3) + 1;
				cnt = cnt + 1;
			}
		}
		cnt = cnt + 3;
		System.out.println(cnt);
	}
}
