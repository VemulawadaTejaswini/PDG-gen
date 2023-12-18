import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i = 0; i < Math.min(n, 50); i++) {
			for(int j = 0; j < Math.min(n, 50); j++) {
				if(i == j) continue;
				ans.add(Integer.parseInt(String.valueOf(list[i]) + String.valueOf(list[j])));
			}
		}
		Collections.sort(ans);
		System.out.println(ans.get(2));
	}
}