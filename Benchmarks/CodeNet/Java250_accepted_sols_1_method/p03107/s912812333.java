//2019/3/15
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int ans = 0;

		char c;

		int[] array = new int[2];

		for(int i=0;i<s.length();i++) {

			c = s.charAt(i);

			if(c=='0') array[0]++;

			else if(c=='1') array[1]++;

			if(array[0]!=0 && array[1]!=0) {

				array[0]--;

				array[1]--;

				ans += 2;
			}
		}

		System.out.println(ans);
	}
}
