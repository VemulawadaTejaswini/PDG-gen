import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result = "No";

		for(int i = 0; i < 26; i += 4) {
			if(i > N) {
				break;
			}else if((N - i) % 7 == 0) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}
