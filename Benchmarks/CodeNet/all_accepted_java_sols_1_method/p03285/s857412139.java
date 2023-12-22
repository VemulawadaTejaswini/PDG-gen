import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result = "No";

		for(int i = 0; i < 26; i++) {
			if(4 * i > N) {
				break;
			}else if((N - 4 * i) % 7 == 0) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}
