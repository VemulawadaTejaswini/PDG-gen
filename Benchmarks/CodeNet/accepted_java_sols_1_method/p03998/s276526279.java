import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String lineA = scanner.next();
		String lineB = scanner.next();
		String lineC = scanner.next();

		String next = lineA.substring(0,1);
		lineA = lineA.substring(1);
		while (true) {
			if (next.equals("a")) {
				if (lineA.length() == 0) {
					System.out.println("A");
					break;
				}else{
					next = lineA.substring(0,1);
					lineA = lineA.substring(1);
				}
			}else if (next.equals("b")) {
				if (lineB.length() == 0) {
					System.out.println("B");
					break;
				}else{
					next = lineB.substring(0,1);
					lineB = lineB.substring(1);
				}
			}else if (next.equals("c")) {
				if (lineC.length() == 0) {
					System.out.println("C");
					break;
				}else{
					next = lineC.substring(0,1);
					lineC = lineC.substring(1);
				}
			}
		}

		scanner.close();
	}

}
