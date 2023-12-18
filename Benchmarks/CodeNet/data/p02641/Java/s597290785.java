import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		Set<Integer> seen = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			seen.add(in.nextInt());
		}
		int diff = 1000;
		int ans = -1;
		for(int i = -200; i <= 200; i++) {
			if(seen.contains(i)) continue;
			if(Math.abs(x - i) < diff) {
				diff = Math.abs(x - i);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}