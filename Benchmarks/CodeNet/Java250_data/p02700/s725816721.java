import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        int tk = sc.nextInt();
        int at = sc.nextInt();
        int ak = sc.nextInt();
        while(true) {
            at -= tk;
            if(at <= 0) {
                System.out.println("Yes");
                return;
            }
            tt -= ak;
            if(tt <= 0) {
                System.out.println("No");
                return;
            }
        }
    }
}