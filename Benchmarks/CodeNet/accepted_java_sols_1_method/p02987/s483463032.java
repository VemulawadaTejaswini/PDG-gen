import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans[] = { "Yes", "No" };
		int an = 0;
		sc.close();
		char tmp[] = s.toCharArray();
		Arrays.sort(tmp);
		int cnt = 1;
		if(tmp[0] != tmp[1] || tmp[2] != tmp[3])an = 1;
		if(tmp[0] == tmp[2])an = 1;
		System.out.println(ans[an]);
	}
}
