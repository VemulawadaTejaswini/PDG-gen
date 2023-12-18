import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ac=0,wa=0,tle=0,re=0;
		for (int i = 0; i < n; ++i) {
			String s = sc.next();
			if (s.equals("AC")) { ++ac; }
			else if (s.equals("WA")) { ++wa; }
			else if (s.equals("TLE")) { ++tle; }
			else if (s.equals("RE")) { ++re; }
		}
		System.out.println("AC × " + ac);
		System.out.println("WA × " + wa);
		System.out.println("TLE × " + tle);
		System.out.println("RE × " + re);
	}
}