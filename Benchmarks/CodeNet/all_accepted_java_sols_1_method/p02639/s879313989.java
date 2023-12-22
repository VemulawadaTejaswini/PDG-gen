import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int output = 0;
        for (int i = 0; i < 5; i++) {

            int findOutput = userInput.nextInt();
            if (findOutput == 0) {
                output = i + 1;
            }
        }
        System.out.println(output);
    }
}