import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Integer> midTermExam = new ArrayList<Integer>();
		List<Integer> finalTermExam = new ArrayList<Integer>();
		List<Integer> reTest = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
 			String[] examInfo = br.readLine().split(" ");
 			int midScore = Integer.parseInt(examInfo[0]);
 			int finalScore = Integer.parseInt(examInfo[1]);
 			int reScore = Integer.parseInt(examInfo[2]);

			if (midScore == -1 && finalScore == -1 && reScore == -1) {
				break;
			}
			midTermExam.add(midScore);
			finalTermExam.add(finalScore);
			reTest.add(reScore);
 		}

		int listSize = midTermExam.size();
		for (int i = 0; i < listSize; i++) {
			int midScore = midTermExam.get(i);
			int finalScore = finalTermExam.get(i);
			int reScore = reTest.get(i);

			if (midScore == -1 || finalScore == -1) {
				System.out.println("F");
			} else if ((midScore + finalScore) >= 80) {
				System.out.println("A");
			} else if ((midScore + finalScore) >= 65) {
				System.out.println("B");
			} else if ((midScore + finalScore) >= 50) {
				System.out.println("C");
			} else if ((midScore + finalScore) >= 30) {
				if (reScore >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}