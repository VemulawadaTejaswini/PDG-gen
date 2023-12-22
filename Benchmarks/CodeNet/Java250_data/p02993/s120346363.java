import java.util.Scanner;

/**
 * Main2
 */
public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] output = input.nextLine().split("");

        for (int i = 0; i < output.length - 1; i++) {
            if (output[i].equals(output[i + 1])) {
                System.out.println("Bad");
                System.exit(0);
            }
        }
        System.out.println("Good");
    }
}