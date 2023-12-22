import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String S;
			int head, tail;
			S = sc.next();
			head = Integer.valueOf(S.substring(0, 2));
			tail = Integer.valueOf(S.substring(2, 4));
			
			boolean headMM = inMM(head);
			boolean tailMM = inMM(tail);
			
			if (headMM && tailMM) {
				System.out.println("AMBIGUOUS");
			} else if (headMM && !tailMM) {
				System.out.println("MMYY");
			} else if (!headMM && tailMM) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static boolean inMM (int value) {
		if (0 < value && value <= 12) {
			return true;
		} else {
			return false;
		}
	}

}