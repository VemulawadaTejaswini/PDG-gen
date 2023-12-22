import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner str = new Scanner(System.in);

	String S = str.nextLine();
	String[] x = S.split("");
	int n = 0;

	for (int i = 0; i < x.length - 1; i++) {
	    if (x[i].compareTo(x[i + 1]) == 0) {
		n++;
	    }
	}

	if (n > 0) {
	    System.out.println("Bad");
	} else {
	    System.out.println("Good");
	}
    }
}