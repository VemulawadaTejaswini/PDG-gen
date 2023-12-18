import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int number = in.nextInt();
            if (number <= 1 || number >= 20) {
            } else {
                System.out.println(factorial(number));
            }

        }
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}