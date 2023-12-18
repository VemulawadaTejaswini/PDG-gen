import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNext()) {
			s = sc.nextLine();
			int n_ioi, n_joi;
			n_ioi = n_joi = 0;
			
			int f = 0;
			while(s.indexOf("JOI", f) != -1) {
				f = s.indexOf("JOI", f);
				f++; n_joi++;
			}

			f = 0;
			while(s.indexOf("IOI", f) != -1) {
				f = s.indexOf("IOI", f);
				f++; n_ioi++;
			}
			
			System.out.println(n_joi);
			System.out.println(n_ioi);
		}
	}
}