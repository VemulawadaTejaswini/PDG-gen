

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (Integer.parseInt(sc.next()));
		int i;
		for(i = 0; i < n; i++) {
			double x1 = (Double.parseDouble(sc.next()));
			double y1 = (Double.parseDouble(sc.next()));
			double x2 = (Double.parseDouble(sc.next()));
			double y2 = (Double.parseDouble(sc.next()));
			double x3 = (Double.parseDouble(sc.next()));
			double y3 = (Double.parseDouble(sc.next()));
			double x4 = (Double.parseDouble(sc.next()));
			double y4 = (Double.parseDouble(sc.next()));
			double a1 = (y1 - y2) / (x1 - x2);
			double a2 = (y3 - y4) / (x3 - x4);

			if(x1 == x2 && x3 == x4) {
				System.out.println("YES");
			}else if (y1 == y2 && y3 == y4) {
				System.out.println("YES");
			}else if(a1 == a2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}

