import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.next();

        int result = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '1') {
                result++;
            }
        }

        System.out.println(result);
    }
}
