import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String l1 = scan.nextLine();
        scan.close();

        int L = Integer.valueOf(l1);
        double side = L / 3.0;
        System.out.println(String.format("%.12f", side * side * side));
	}
}