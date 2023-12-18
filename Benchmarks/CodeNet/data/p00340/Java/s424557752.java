import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int[] sides = new int[4];
		for(int i = 0; i < 4; i++) {
			sides[i] = stdin.nextInt();
		}

		if(sides[0] == sides[1] && sides[2] == sides[3]) {
			System.out.println("yes");
		} else if(sides[0] == sides[2] && sides[1] == sides[3]) {
			System.out.println("yes");
		} else if(sides[0] == sides[3] && sides[2] == sides[1]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}