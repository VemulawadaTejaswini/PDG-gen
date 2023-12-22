
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flg = false;
        for (int i = 0 ; i < N ; i++) {
            String s = sc.next();
            if (s.equals("Y")) {
                flg = true;
            }
        }
        if (flg) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }

}