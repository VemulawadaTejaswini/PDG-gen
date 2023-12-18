import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int a        = Integer.parseInt(tmp[0]);
		int b        = Integer.parseInt(tmp[1]);
		int c        = Integer.parseInt(tmp[2]);
		int k        = Integer.parseInt(scanner.nextLine());

		boolean flg = false;

		for(int i = 0; i < k; i++) {

			for(int j = k - i; j > 0; j--) {

				int bb = b * (int)Math.pow(2, i);
				int cc = c * (int)Math.pow(2, j);

				if(cc > bb && bb > a) {

					flg = true;
					break;
				}
			}
		}

		String ans = flg ? "Yes" : "No";

		System.out.println(ans);
	}
}
