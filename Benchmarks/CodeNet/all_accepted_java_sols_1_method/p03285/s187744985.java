import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean flag = false;
		for (int i = 0; i <= N; i++) {
			if(flag) {break;}
			for(int j = 0; j <= N; j ++) {
				if (4 * i + 7 * j == N) {
					flag = true;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
