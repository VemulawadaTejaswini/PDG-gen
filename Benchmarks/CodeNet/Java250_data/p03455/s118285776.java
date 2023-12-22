import java.util.*;

/**
 * ABC086 A問題
 * シカのAtCoDeerくんは二つの正整数a,bを見つけました。 
 * aとbの積が偶数か奇数か判定してください。
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int a = sn.nextInt();
        int b = sn.nextInt();
        int ans = a * b;
        
        if((ans % 2) == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
