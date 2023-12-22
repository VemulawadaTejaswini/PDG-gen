import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int x = Integer.parseInt(temp[1]);

		String[] tmp = sc.nextLine().split(" ");

		int ans = 0;
		int count = 1;
		for(int i = 0; i < tmp.length; i++) {

			ans += Integer.parseInt(tmp[i]);

			if(ans > x) {

				break;

			}

			count++;

		}

		System.out.println(count);


	}

}
