import java.util.*;

/**
 * Created by Surya on 9/24/2017.
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt();
        int val = 1;
        for (int i = 0; i < a; i++) {
            if (val >= b) {
                val += b;
            } else {
                val *= 2;
            }
        }
        System.out.println(val);
    }
  
}