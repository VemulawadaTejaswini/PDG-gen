import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static int[] MEMO;
    
    static {
        int[] ary = new int[45];
        ary[0] = ary[1] = 1;
        MEMO = ary;
    }
    
    public static void main(String[] args) {
        System.out.println(calc(scn.nextInt()));
    }
    
    private static int calc(int n) {
        if(MEMO[n] == 0) {
            MEMO[n] = calc(n - 1) + calc(n - 2);
        }
        return MEMO[n];
    }
}