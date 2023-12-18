import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");

		int ans = 0;
		for(int i = 0; i < 5; i++){

			if(Integer.parseInt(tmp[i]) == 0) {
				ans = i + 1; break;
			}

		}

			System.out.println(ans);

	}

}
