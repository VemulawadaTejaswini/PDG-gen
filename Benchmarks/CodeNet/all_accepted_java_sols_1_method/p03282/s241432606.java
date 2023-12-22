import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String n = scanner.nextLine();
		long   k = scanner.nextLong();
		long ans = 0;
		boolean flg = true;

		ans = Long.parseLong(n.substring(0, 1));

		if(ans == 1){
			for(int i = 1; i < k; i++) {

				long x  =Long.parseLong(n.substring(i, i + 1));


				if(x != 1) {

					ans = Long.parseLong(n.substring(i, i + 1));
					flg = false;
					break;
				}
			}

			if(flg) ans = 1;
		}

		System.out.println(ans);



	}
}
