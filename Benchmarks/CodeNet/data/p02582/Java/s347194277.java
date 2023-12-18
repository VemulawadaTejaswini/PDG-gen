import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] n    = scanner.nextLine().toCharArray();
		int ans = 0;
		int cnt = 0;

		for(char x : n) {

			if(x == 'R') {
				cnt++;
				ans = Math.max(ans, cnt);
			}else {
				cnt = 0;
			}
		}

		System.out.println(ans);
	}
}