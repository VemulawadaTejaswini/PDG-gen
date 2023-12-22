import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		sc.close();
		String ans[] = { "Yes", "No" };
		int a = 0;
		if (nt != ns)
			a = 1;
		else {
			if (!s.equals(t)) {
				String tmp = s;
				for (int i = 0; i < ns; ++i) {
					tmp = tmp.substring(ns - 1) + tmp.substring(0, ns - 1);
					if(tmp.equals(t))break;
				}
				if(tmp.equals(s))a = 1;
			}
		}
		System.out.println(ans[a]);
	}

}
