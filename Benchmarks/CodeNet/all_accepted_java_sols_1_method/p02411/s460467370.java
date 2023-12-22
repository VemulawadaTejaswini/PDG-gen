import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int m = Integer.parseInt(in.next());
			int f = Integer.parseInt(in.next());
			int r = Integer.parseInt(in.next());
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			int total = m + f;
			String grade;
			if (m == -1 || f == -1) {
				grade = "F";
			} else if (total >= 80) {
				grade = "A";
			} else if (total >= 65) {
				grade = "B";
			} else if (total >= 50) {
				grade = "C";
			} else if (total >= 30) {
				if (r >= 50) {
					grade = "C";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println(grade);
		}
		in.close();
	}
}	
