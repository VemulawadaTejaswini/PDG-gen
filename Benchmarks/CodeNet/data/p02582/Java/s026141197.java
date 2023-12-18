import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int max = 0;
		int count = 0;
		for (char c : arr) {
		    if (c == 'R') {
		        count++;
		        max = Math.max(max, count);
		    } else {
		        count = 0;
		    }
		}
		System.out.println(max);
	}
}
