import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h, m, s;
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		while (h != -1 && m != -1 && s != -1) {
			int rest1 = 120 * 60;
			int rest2 = 120 * 60;
			int time1 = h * 3600 + m * 60 + s;
			int time2 = time1 / 3;
			rest1 -= time1;
			rest2 -= time2;
			
			int h1 = rest1 / 3600;
			int s1 = (rest1 % 3600) / 60;
			int t1 = rest1 % 60;
			if (h1 < 10) System.out.print("0" + h1);
			else System.out.print(h1);
			System.out.print(":");
			if (s1 < 10) System.out.print("0" + s1);
			else System.out.print(s1);
			System.out.print(":");
			if (t1 < 10) System.out.print("0" + t1);
			else System.out.print(t1);
			System.out.println();
			
			h1 = rest2 / 3600;
			s1 = (rest2 % 3600) / 60;
			t1 = rest2 % 60;
			if (h1 < 10) System.out.print("0" + h1);
			else System.out.print(h1);
			System.out.print(":");
			if (s1 < 10) System.out.print("0" + s1);
			else System.out.print(s1);
			System.out.print(":");
			if (t1 < 10) System.out.print("0" + t1);
			else System.out.print(t1);
			System.out.println();
			
			h = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
		}
	}
}