import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		long ans   = 0;

		for(int i = 0; i < tmp.length(); i++) {
			int y = Integer.parseInt(tmp.substring(i, i + 1));
			ans += y;

		}

		String a;
		if(ans % 9 == 0) {
			a = "Yes";
		}else {
			a = "No";
		}


		System.out.println(a);

	}

}
