import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        while(true) {
            num1 = Integer.parseInt(scan.next());
            num2 = Integer.parseInt(scan.next());

            if (num1 == 0 && num2 == 0) break;

            if (num1 < num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
    }
}

