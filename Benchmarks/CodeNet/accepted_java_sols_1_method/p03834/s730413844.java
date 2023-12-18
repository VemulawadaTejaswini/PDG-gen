import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            String[] split = s.split(",");
            System.out.println(split[0] + " " + split[1] + " " + split[2]);
        }
    }
}
