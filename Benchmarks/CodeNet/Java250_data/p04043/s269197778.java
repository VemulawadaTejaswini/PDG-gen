import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SC = 0, FC = 0;

		for(int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();

			if(tmp == 5)
				FC++;
			else if(tmp == 7)
				SC++;

		}

		String ans = "NO";
		if(FC == 2 && SC == 1)
			ans = "YES";

		System.out.println(ans);
		return;

	}

}

