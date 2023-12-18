import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] inputs = new Scanner(System.in).nextLine().split(" ");
		int w =  Integer.parseInt(inputs[0]);
		int a  = Integer.parseInt(inputs[1]);
		int b = Integer.parseInt(inputs[2]);
		
		int redRightEdge = a + w;
		int greenRightEdge = b + w;
		
		if (redRightEdge >= b && redRightEdge <= greenRightEdge) {
			System.out.println("0");
			return;
		}
		System.out.println(Math.min(Math.abs(redRightEdge - b), Math.abs(greenRightEdge - a)));
	}
}