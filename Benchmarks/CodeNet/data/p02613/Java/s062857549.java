import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ac=0,wa=0,tle=0,re=0;
		for (int i = 0; i < N; ++i) {
			String S = sc.nextLine();
			if (S.equals("AC")) ++ac;
			else if (S.equals("WA")) ++wa;
			else if (S.equals("TLE")) ++tle;
			else if (S.equals("RE")) ++re;
		}
		System.out.println("AC × " + ac);
		System.out.println("WA × " + wa);
		System.out.println("TLE × " + tle);
		System.out.println("RE × " + re);
	}
}