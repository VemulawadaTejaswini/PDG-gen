import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();
	    String[] inputArray = input.split(" ");
	    int abRange = Integer.parseInt(inputArray[0]);
	    int bcRange = Integer.parseInt(inputArray[1]);
	    int caRange = Integer.parseInt(inputArray[2]);
	    int shortRange = Math.min(caRange + abRange, Math.min(abRange+bcRange, bcRange + caRange));
	    System.out.println(shortRange);
	    scanner.close();
	}
}
