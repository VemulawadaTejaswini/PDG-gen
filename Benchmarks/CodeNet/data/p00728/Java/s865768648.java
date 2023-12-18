import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			int n= sc.nextInt();
			if(n == 0) break;
			int min = 1000;
			int max = 0;
			int score = 0;
			for(int i=0;i<n;i++) {
				int s = sc.nextInt();
				score += s;
				min = Math.min(s, min);
				max = Math.max(s, max);
			}
			System.out.println(( score-(min+max) ) / (n-2)  );
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}