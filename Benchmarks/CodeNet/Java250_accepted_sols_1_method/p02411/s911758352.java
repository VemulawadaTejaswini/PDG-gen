import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		List<String> result = new ArrayList<>();
		while (true) {
			int m = stdin.nextInt();
			int f = stdin.nextInt();
			int r = stdin.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			int grade = m+f;
			if ( grade < 30 || m == -1 || f == -1 ) {
				result.add("F");
			} else {

				if (grade >= 80) {
					result.add("A");
				} else if (grade >= 65 && grade < 80) {
					result.add("B");
				} else if (grade >= 50 && grade < 65) {
					result.add("C");
				} else if (grade >= 30 && grade < 50) {
					if( r >= 50 ) {
						result.add("C");
					}else {
						result.add("D");
					}				
				}
			}
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}
}