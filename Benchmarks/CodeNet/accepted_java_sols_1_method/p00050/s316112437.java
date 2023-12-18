import java.util.Scanner;

public class Main {
static final String APPLE = "apple";
static final String PEACH = "peach";
static final String D     = "\nP\n";

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while (in.hasNextLine()) {
	String text =
	    in.nextLine().replace(APPLE, D)
	        .replace(PEACH, APPLE)
	        .replace(D, PEACH);
	System.out.println(text);
  }
}
}