
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	String s;

	public void run() {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int ans = 0;
		if(s.charAt(0)=='1') ans++;
		if(s.charAt(1)=='1') ans++;
		if(s.charAt(2)=='1') ans++;
		System.out.println(ans);
		sc.close();
	}
}
