import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int numBoll = sn.nextInt();
		int numPerson = sn.nextInt();

		// 一人
		if (numPerson == 1) {
			System.out.println("0");

		}else {
			System.out.println(numBoll - numPerson);
		}

	}
}
