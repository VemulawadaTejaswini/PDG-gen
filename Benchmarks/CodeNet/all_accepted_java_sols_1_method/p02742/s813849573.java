import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h == 1 || w == 1) {
            System.out.println(1);
        } else {
            System.out.println( (((long) h * w + 1 ) / 2));
        }
    }

}
