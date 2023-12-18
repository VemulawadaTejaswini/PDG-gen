import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (prev >= x) {
		        count++;
		        max = Math.max(max, count);
		    } else {
		        count = 0;
		    }
		    prev = x;
		}
		System.out.println(max);
   }
}
