import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		String w, t, end = "END_OF_TEXT";
		int ans = 0;
		
		w = scan.next();
		while (true) {
			t = scan.next(); if (t.equals(end)) break;
			if (t.equalsIgnoreCase(w)) ans++;
		}
		
		// 出力
		System.out.println(ans);
	}
}

