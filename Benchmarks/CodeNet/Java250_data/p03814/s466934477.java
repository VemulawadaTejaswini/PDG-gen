import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            System.out.println(s.lastIndexOf("Z") - s.indexOf("A") + 1);
        }
    }
}
