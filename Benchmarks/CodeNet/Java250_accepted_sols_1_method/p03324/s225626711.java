import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int m = 0;
        if (d == 0) {
            if (n == 100) {
                m = 101;
            }else{
                m = n;
            }
        }else if (d == 1) {
            if (n == 100) {
                m = 100*101;
            }else{
                m = 100*n;
            }
        }else if (d == 2) {
            if (n == 100) {
                m = 10000*101;
            }else{
                m = 10000*n;
            }
        }
        System.out.println(m);
    }
}