
import java.util.*;

//クラス名をMainに変える
public class Main{
	public static void main(String[] args) {

		// input
		Scanner scan = new Scanner(System.in);
		String sa = scan.next();
		String sb = scan.next();
		String sc = scan.next();

		scan.close();

		char[] SequenceA = sa.toCharArray();
		char[] SequenceB = sb.toCharArray();
		char[] SequenceC = sc.toCharArray();

		char player = 'a';
		int discardcardA = 0;
		int discardcardB = 0;
		int discardcardC = 0;

		char res = 'd';

		boolean flag = true;
		do {
			// update
			if (player == 'a') {

				if (SequenceA.length == discardcardA) {
					res = 'A';
					flag = false;
				} else {

					player = SequenceA[discardcardA];
					discardcardA++;
				}
			} else if (player == 'b') {
				if (SequenceB.length == discardcardB) {
					res = 'B';
					flag = false;
				} else {

					player = SequenceB[discardcardB];
					discardcardB++;
				}
			} else if (player == 'c') {
				if (SequenceC.length == discardcardC) {
					res = 'C';
					flag = false;
				} else {

					player = SequenceC[discardcardC];
					discardcardC++;
				}
			}
		} while (flag == true);

		// output
		System.out.println(res);
	}
}