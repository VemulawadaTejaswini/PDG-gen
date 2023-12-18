import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a > mx) mx = a;
            if(a < mx) mn = a;
            sum += a;
        }
        System.out.println("" + mn + " " + mx + " " + sum);
    }
}