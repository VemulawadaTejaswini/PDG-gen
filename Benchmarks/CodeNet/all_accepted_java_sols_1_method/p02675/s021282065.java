import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.lines().forEach((String input) -> {
            char lastChar = input.charAt(input.length() - 1);

            switch (lastChar) {
                case '2':
                case '4':
                case '5':
                case '7':
                case '9':
                    System.out.print("hon");
                    break;
                case '0':
                case '1':
                case '6':
                case '8':
                    System.out.print("pon");
                    break;
                case '3':
                    System.out.print("bon");
                    break;
                default:
                    break;
            }
        });
    }
}