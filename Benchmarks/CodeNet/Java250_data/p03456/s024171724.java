import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        double c = Math.sqrt(new Double(sc.next() + sc.next()));
        System.out.println((c == (int)c) ? "Yes" : "No");
    }
}
