import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.nextLine();
            int w = Integer.parseInt(in.nextLine());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < S.length(); i += w) {
                sb.append(S.charAt(i));
            }

            System.out.println(sb.toString());
        }
    }
}
