import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//CUIに入力したいから。

		int m, f, r;
		ArrayList<String> results = new ArrayList<String>();
		while(true) {
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			if (m == -1 || f == -1) results.add("F");
			else if (m + f >= 80) results.add("A");
			else if (m + f >=65 && m + f <80) results.add("B");
			else if (m + f >=50 && m + f<65) results.add("C");
			else if (m + f >=30 && m + f <50 && r>=50) results.add("C");
			else if (m + f >=30 && m + f < 50 && r < 50) results.add("D");
			else if (m + f <30) results.add("F");
		}
		for (int i = 0;  i < results.size(); i++) {
			System.out.println(results.get(i));
		}



 	}
}
