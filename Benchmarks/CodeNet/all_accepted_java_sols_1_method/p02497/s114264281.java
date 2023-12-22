import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int midExam = -1, finalExam = -1, supple = -1, sumExam = 0;
		char grade = 0;
		
		for (;;) {
			try {
				midExam = in.nextInt();
				finalExam = in.nextInt();
				supple = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (midExam == -1 && finalExam == -1 && supple == -1)
				break;
			sumExam = midExam + finalExam;
			
			if (midExam == -1 || finalExam == -1 || sumExam < 30)
				grade = 'F';
			else if (sumExam >= 80)
				grade = 'A';
			else if (sumExam >= 65)
				grade = 'B';
			else if (sumExam >= 50 || supple >= 50)
				grade = 'C';
			else
				grade = 'D';

			System.out.println(grade);
		}
	}
}