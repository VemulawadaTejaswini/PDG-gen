import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextInt();
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (a*a == b*b+c*c) {
                    System.out.println("YES");
                } else if (b*b == c*c+a*a) {
                    System.out.println("YES");
                } else if (c*c == a*a+b*b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
