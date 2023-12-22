import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = Double.parseDouble(sc.next()), h = Double.parseDouble(sc.next()), x = Double.parseDouble(sc.next()), y = Double.parseDouble(sc.next());

        System.out.println((w * h) / 2 + " " + (w / 2 == x && h / 2 == y ? "1" : "0"));
    }
}
