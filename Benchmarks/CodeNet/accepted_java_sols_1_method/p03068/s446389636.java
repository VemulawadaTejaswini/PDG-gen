
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		int k = Integer.parseInt(sc.next());
		sc.close();
		String[] s = new String[n];
		for (int i=0; i<n; i++){
			s[i] = String.valueOf(sline.charAt(i));
		}
		String dels = s[k-1];
		for(int i=0; i<n; i++) {
			if (!s[i].equals(dels)) {
				s[i] = "*";
			}
			System.out.print(s[i]);
		}
	}
}
