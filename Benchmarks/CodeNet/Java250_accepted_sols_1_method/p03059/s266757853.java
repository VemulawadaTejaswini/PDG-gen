import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int answer = 0;
		
	    Scanner scanner = new Scanner(System.in);
	    int multiples = scanner.nextInt();
	    int units = scanner.nextInt();
	    int duration = scanner.nextInt();
		
		answer = (int) Math.floor((duration / multiples) * units);
		
		System.out.println(answer);
	}

}
