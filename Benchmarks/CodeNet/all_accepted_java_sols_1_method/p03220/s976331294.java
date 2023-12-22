import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		String[] temp1 = scanner.nextLine().split(" ");
		int t = Integer.parseInt(temp1[0]);
		int a = Integer.parseInt(temp1[1]);

		String[] temp2 = scanner.nextLine().split(" ");
		double flag =  Math.abs(a - (t - Integer.parseInt(temp2[0]) * 0.006));
		double tmp = 0;
		int ans = 1;

		for(int i = 2; i < n + 1; i++) {

			tmp = Math.abs(a - (t - Integer.parseInt(temp2[i - 1]) * 0.006));


			if( flag > tmp) {
				flag = tmp;
				ans = i;
			}

		}

		System.out.println(ans);

	}

}
