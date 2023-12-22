import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String l1 = scan.nextLine();
        scan.close();

        int h = Integer.valueOf(l1.split(" ")[0]);
        int a = Integer.valueOf(l1.split(" ")[1]);

        int result = 0;

        while (true) {
        	result++;

        	h = h - a;

        	if (h <= 0) {

                System.out.println(result);
                return;
        	}
        }
	}
}
