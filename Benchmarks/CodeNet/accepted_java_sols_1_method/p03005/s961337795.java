import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //scanner.nextLine();
        int k = scanner.nextInt();
        //scanner.nextLine();

        if(k == 1) {
            System.out.println(0);
        } else {
            System.out.println(n - k);
        }
    }
}