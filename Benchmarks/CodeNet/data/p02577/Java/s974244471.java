import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] tmp = sc.nextLine().toCharArray();
		long ans   = 0;

		for(char x : tmp) {

			ans += x;
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
