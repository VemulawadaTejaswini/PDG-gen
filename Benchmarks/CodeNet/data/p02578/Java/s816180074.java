import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long steps = 0;
		long level;
		
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		level = a[0];
		
		for(int i = 0; i < n -1; i++) {
			if(level > a[i + 1]) {
				steps += (level - a[i + 1]);
			} else {
				level = a[i + 1];
			}
		}
		
		System.out.println(steps);
	}

}