import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long left;
        long right;
        long mid;
        if ((B-A-1)%2 == 1) {
            left = A-1+(B-A)/2;
            right = N-B+(B-A)/2;
            mid = (B-A)/2;
        } else {
            left = A+(B-A-1)/2;
            right = N-B+1+(B-A-1)/2;
            mid = Long.MAX_VALUE;
        }
        /*
        System.out.println("l " + left);
        System.out.println("r " + right);
        System.out.println("m " + mid);
        */

        System.out.println(Math.min(Math.min(left, right), mid));
    }
}
