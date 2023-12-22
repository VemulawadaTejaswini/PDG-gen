import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.next());
        double y1 = Double.parseDouble(sc.next());
        double x2 = Double.parseDouble(sc.next());
        double y2 = Double.parseDouble(sc.next());

        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}