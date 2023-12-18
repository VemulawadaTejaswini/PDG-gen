import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x2000 = sc.nextInt();
        int xprev = x2000;
        for (int i = 2001; i <= 2010; i++) {
            int x = r * xprev - d;
            System.out.println(x);
            xprev = x;
        }
    }

}
