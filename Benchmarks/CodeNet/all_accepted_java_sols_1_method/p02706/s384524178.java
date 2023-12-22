import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            n -= scan.nextInt();
        }
        if (n >= 0) System.out.println(n);
        else System.out.println(-1);
    }
}