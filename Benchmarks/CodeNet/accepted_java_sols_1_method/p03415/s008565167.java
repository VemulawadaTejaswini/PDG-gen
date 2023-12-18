import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String line1 = in.next();
            String line2 = in.next();
            String line3 = in.next();
            StringBuilder res = new StringBuilder();
            res.append(line1.charAt(0));
            res.append(line2.charAt(1));
            res.append(line3.charAt(2));
            System.out.println(res.toString());
        }
    }
}
