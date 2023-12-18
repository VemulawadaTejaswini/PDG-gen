import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int numOfOne = sc.nextInt();

        value %= 500;
        if (numOfOne - value >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
