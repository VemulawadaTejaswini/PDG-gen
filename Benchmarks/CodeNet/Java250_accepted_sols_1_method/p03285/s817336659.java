import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result = "No";
		for(int i = 0; i <= 100/4;i++) {
			for(int j = 0; j <= 100/7;j++) {
				int total = 4 * i + 7 * j;
				if(total == N) {
					result = "Yes";
					break;
				}
			}
		}
		System.out.println(result);

	}

}