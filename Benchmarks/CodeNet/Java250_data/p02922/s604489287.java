import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		int ans = 0;
		int sum = 1;

		while(sum < b) {

			sum += a - 1;
			ans ++;
		}

		System.out.println(ans);
	}

}
