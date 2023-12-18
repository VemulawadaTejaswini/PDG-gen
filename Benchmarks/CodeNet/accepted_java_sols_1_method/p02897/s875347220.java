import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();

	    int odd = 0;
	    for (int i=1; i<=input; i++) {
		    if (i % 2 != 0) odd++;
	    }
	    double answer = (double) odd /input;
	    System.out.println(String.format("%.10f", answer));
	    scanner.close();
	}

}
