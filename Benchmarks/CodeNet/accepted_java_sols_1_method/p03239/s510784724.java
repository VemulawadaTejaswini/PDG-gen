import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp1 = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp1[0]);
		int t = Integer.parseInt(temp1[1]);

		int ans = Integer.MAX_VALUE;
		int flag = 0;

		String[] temp2 = new String[2];
		for(int i = 0; i < n; i++) {

			temp2 = scanner.nextLine().split(" ");

			if(Integer.parseInt(temp2[1]) <= t) {
				ans = Math.min(ans, Integer.parseInt(temp2[0]));
				flag++;
			}


		}

		if(flag == 0) {
			System.out.println("TLE");
		}else {
			System.out.println(ans);
		}


	}

}
