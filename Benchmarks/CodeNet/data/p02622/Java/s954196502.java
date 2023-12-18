import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String t = sc.next();
		sc.close();
		if(a.equals(t)) {
			prtln(0);
			return;
		}
		char[] ac = a.toCharArray();
		char[] tc = t.toCharArray();
		int answer = 0;
		for(int i = 0; i < ac.length; i++) {
			if(ac[i] != tc[i]) answer++;
		}
		prtln(answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
