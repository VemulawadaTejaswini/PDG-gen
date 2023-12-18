import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String[] str = scan.nextLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }

}