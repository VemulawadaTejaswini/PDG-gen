import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(0);
        String res0 = sc.next();
        if (res0.equals("Vacant")) {
            return;
        }

        int left = 0;
        int right = N;
        String evenKey = res0; 

        // binary search
        while (left < right) {
            int mid = (left+right)/2;
            System.out.println(mid);
            String resm = sc.next();
            if (resm.equals("Vacant")) {
                return;
            }
            if ((mid%2 == 0 && !resm.equals(evenKey))
                || (mid%2 == 1 && resm.equals(evenKey))) {
                right = mid;
            } else {
                left = mid;
            }
        }
    }
}
