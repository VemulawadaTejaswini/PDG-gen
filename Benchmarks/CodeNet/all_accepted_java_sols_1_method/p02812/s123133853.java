import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int cnt = 0;
		for (int i = 0; i < n - 2; ++i){
			String tmp = s.substring(i, i + 3);
			if(tmp.equals("ABC"))
			++cnt;
		}
		System.out.println(cnt);
	}
}
