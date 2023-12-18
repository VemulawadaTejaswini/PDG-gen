import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String question = sc.next();
		String suziArray[] = question.split("");
		int answerCount = 0;
		for(String suzi: suziArray) {
			if(suzi.equals("1")) {
				answerCount++;
			}
		}
		System.out.println(answerCount);
	}

}
