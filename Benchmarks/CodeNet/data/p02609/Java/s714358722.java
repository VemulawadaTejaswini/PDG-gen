import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bit = sc.next();

        for (int i = n-1; i >=0 ; i--) {
            int x = Integer.parseInt(bit, 2);
            int target = 1 << i;
            int val = x ^ target;
            int count = func(val);
            System.out.println(count);
        }

    }

    private static int func(int n) {
        int count = 0;
        int popcount = Integer.bitCount(n);
        while (n != 0) {
            count++;
            n %= popcount;
            popcount = Integer.bitCount(n);
        }
        return count;
    }
}