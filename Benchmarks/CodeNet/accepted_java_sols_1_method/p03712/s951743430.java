
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String frame = "#";
		StringBuilder sb = new StringBuilder();

		sb.append(frame.repeat(B+2));
		sb.append("\n");
		for (int i = 0; i < A; i++) {
			sb.append(frame + sc.next() + frame );
			sb.append("\n");
		}
		sb.append(frame.repeat(B+2));

		System.out.println(sb.toString());




	}


}

