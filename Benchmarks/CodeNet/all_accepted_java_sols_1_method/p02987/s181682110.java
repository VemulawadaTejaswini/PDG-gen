import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner str = new Scanner(System.in);

	String S  = str.nextLine();
	String x[] = S.split("");

	int m = 0;

	for (int i = 0; i < x.length - 1; i++) {
	    for (int j = i + 1; j < x.length; j++) {
		if (x[i].compareTo(x[j]) == 0) {
		    m++;
		}
	    }
	}

	if (m == 2) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}