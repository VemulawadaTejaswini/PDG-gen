import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			
			if (m == -1 && f == -1 && r == -1)
				break;
			
			char grade = 'F';
			
			if (m < 0 || f < 0) {
				grade = 'F';
			} else if (m + f >= 80) {
				grade = 'A';
			} else if (m + f >= 65) {
				grade = 'B';
			} else if (m + f >= 50) {
				grade = 'C';
			} else if (m + f >= 30) {
				if (r < 50) {
					grade = 'D';
				} else {
					grade = 'C';
				}
			} else {
				grade = 'F';
			}
			
			System.out.println(grade);
		}

	}

}

