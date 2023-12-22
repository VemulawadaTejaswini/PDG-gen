import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "No";

        char[] input = scanner.next().toCharArray();

        if (input[1] == input[2]) {
            if (input[0] == input[1] || input[2] == input[3]) {
                result = "Yes";
            }
        }

        System.out.println(result);

    }
}
