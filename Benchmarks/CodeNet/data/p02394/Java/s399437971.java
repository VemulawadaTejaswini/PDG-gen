import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt(), H = scan.nextInt(), x = scan.nextInt(), y = scan.nextInt(), r = scan.nextInt();

        if ((W < x + r || H < y + r) && (x - r <= 0 || y - r <= 0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}