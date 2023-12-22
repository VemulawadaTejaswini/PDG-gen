import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;
	String[] line = sc.nextLine().split(" ");
	a = Integer.parseInt(line[0]);
	b = Integer.parseInt(line[1]);

	if (a < b) {
	    System.out.println("a < b");
	} else if (a > b) {
	    System.out.println("a > b");
	} else {
	    System.out.println("a == b");
	}
    }
}