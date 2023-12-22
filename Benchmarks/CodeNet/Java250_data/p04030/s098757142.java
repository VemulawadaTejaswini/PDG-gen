import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                    sb.append(c);
                    break;
                case 'B':
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }

        System.out.println(sb.toString());
    }
}
