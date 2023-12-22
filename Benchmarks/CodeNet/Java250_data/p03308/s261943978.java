import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = 0,min = 1000000000;
		for(int i = 0;i < n;i ++) {
			int d = in.nextInt();
			max = Math.max(max, d);
			min = Math.min(min, d);
		}
		System.out.println(max - min);
	}
}
