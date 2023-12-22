import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w  = sc.nextInt();
        int n = sc.nextInt();

        int c = 0;
        while (n > 0) {
            n -= Math.max(h, w);
            c++;
        }
        System.out.println(c);
    }

}
