import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        while (a > 0 && d > 0) {
            c = c - b;
            if (c <= 0) {
                System.out.println("Yes");
                break;
            }
            a = a - d;
            if (a <= 0) {
                System.out.println("No");
                break;
            }
        }
    }

}
