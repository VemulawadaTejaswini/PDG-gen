import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long res = 1;
        for (int i=0; i<n; i++) {
        	long a = scan.nextLong();
            res *= a;
        }
        scan.close();
        if( res > 1000000000000000000L ) System.out.println("-1");
        else System.out.println("" + res);
    }
}