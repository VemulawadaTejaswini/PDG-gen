import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int c = s.nextInt();
			int ans = check(c);
			System.out.println(ans);
		}
	}
	static int check(int c) {
		boolean[] prime = new boolean[c+1];
		int count = 0;
		for(int i = 2; i <= Math.sqrt(c); i++) {
			for(int j = i + i; j <= c; j += i) {
				prime[j] = true;
			}
		}
		for(int i = 2; i <= c; i++) {
			if(!prime[i]) {
				count++;
			}
		}
		return count;
	}
}