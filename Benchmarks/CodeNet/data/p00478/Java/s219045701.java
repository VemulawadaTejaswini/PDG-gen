import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		String tar = sc.next();
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			String con = s + s;
			if(con.contains(tar)) ans++;
		}
		System.out.println(ans);
	}
}