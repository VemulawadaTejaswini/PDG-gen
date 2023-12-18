import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		while(true) {
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			
			if (m == -1 && f == -1 && r == -1) break;
			if (m == -1 || f == -1) {
				output.append("F").append('\n');
			} else {
				if (m + f >= 80)
					output.append("A").append('\n');
				if (m + f >= 65 && m + f < 80)
					output.append("B").append('\n');
				if (m + f >= 50 && m + f < 65)
					output.append("C").append('\n');
				if (m + f >= 30 && m + f < 50) {
					if (r >= 50) {
						output.append("C").append('\n');
					} else {
						output.append("D").append('\n');
					}
				}
				if (m + f < 30)
					output.append("F").append('\n');
			}
			
		}
		System.out.print(output);
		scan.close();
	}

}