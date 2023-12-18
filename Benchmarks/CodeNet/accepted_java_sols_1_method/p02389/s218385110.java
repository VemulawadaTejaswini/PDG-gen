import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;

	String[] line = sc.nextLine().split(" ");
	a = Integer.parseInt(line[0]);
	b = Integer.parseInt(line[1]);

	int menseki = a * b;
	int shu = 2 * a + 2 * b;
	System.out.println(menseki + " " + shu);
    }
}