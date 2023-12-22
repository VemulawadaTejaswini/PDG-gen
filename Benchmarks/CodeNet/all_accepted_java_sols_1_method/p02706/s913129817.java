import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong(), m = scan.nextLong();
        for(int i = 0; i < m; i++) {
            n -= scan.nextLong();
            if(n < 0) {
                System.out.println(-1);
                scan.close();
                return;
            }
        }
        System.out.println(n);
        scan.close();
        return;
    }
}