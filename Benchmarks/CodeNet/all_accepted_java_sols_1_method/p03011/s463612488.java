import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int min = 1000;

        if (p + q < 1000) {
            min = p + q;
        }
        if (p + r < min) {
            min = p + r;
        }
        if (q + r < min) {
            min = q + r;
        }
        System.out.println(min);
    }
}