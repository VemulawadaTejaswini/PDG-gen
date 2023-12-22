import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int m, f, r;
		String s;
		m = scanner.nextInt();
		f = scanner.nextInt();
		r = scanner.nextInt();
		while(!(m == -1 && f == -1 && r == -1)) {
			int p = m+f;
			if(m == -1 || f == -1 || p < 30)
				s = "F";
			else if(p >= 80)
				s = "A";
			else if(p >= 65 && p < 80)
				s = "B";
			else if(p >= 50 && p < 65 || r >= 50)
				s = "C";
			else if(p >= 30 && p < 50)
				s = "D";
			else s = "";
			System.out.println(s);
			m = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
		}
		scanner.close();
	}
}