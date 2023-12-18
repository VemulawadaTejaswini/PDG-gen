import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		int cnt = 0;

		for(int i = 1; i <= length;i++) {
			cnt += (sc.nextInt() != i) ? 1 : 0;
			if(cnt >= 3) {
				break;
			}
		}

		System.out.println(cnt <= 2 ? "YES" : "NO");
	}
}
