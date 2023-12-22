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

		int n      = Integer.parseInt(scanner.nextLine()) - 400;
		int ans    = 8;
		boolean flg = true;
		while(flg) {

			if(n >= 200) {

				n -= 200;
				ans--;
			}else {
				flg = false;
			}
		}

		System.out.println(ans);


		/*
		 * 400以上599以下：8級
		 * 600以上799以下：7級
		 * 800以上999以下：6級
		 * 1000以上1199以下：5級
		 * 1200以上1399以下：4級
		 * 1400以上1599以下：3級1600以上1799以下：2級1800以上1999以下：1級
		 */


	}

}
