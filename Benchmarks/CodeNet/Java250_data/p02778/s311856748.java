import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            StringBuilder xxx = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                xxx.append("x");
            }
            System.out.println(xxx.toString());
        }
    }
}