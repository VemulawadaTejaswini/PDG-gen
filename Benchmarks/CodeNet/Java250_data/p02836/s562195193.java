import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] list = scanner.nextLine().toCharArray();
		int ans = 0;
		int ran = list.length;
		for(int i = 0; i < ran / 2; i++) {

			if(list[i] != list[ran - i - 1]) {

				ans++;

			}
		}


		System.out.println(ans);

	}
}
