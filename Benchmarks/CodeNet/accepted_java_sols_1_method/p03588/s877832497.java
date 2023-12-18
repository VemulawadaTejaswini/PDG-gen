import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int infoNum = sc.nextInt();
		int smallPointSequence = 0;
		int smallPoint = 0;
		for(int i = 0; i < infoNum; i++) {
			int sequence = sc.nextInt();
			int point = sc.nextInt();
			if(sequence > smallPointSequence) {
				smallPointSequence = sequence;
				smallPoint = point;
			}
		}
		while(smallPoint > 0) {
			smallPointSequence++;
			smallPoint--;
		}
		System.out.println(smallPointSequence);
	}

}
