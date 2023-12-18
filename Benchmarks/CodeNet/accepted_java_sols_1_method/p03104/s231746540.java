import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long num;
        if (end - start == 1) {
            num = start ^ end;
        } else if (end - start == 0) {
            num = start;
        } else {
            num = 0;
            for (long i = start - (start % 4) + 3; i >= start; i--) {
                num ^= i;
            }
            for (long i = end - (end % 4); i <= end; i++) {
                num ^= i;
            }
        }
        // 455 none
        // 456 456
        // 457 456 457
        // 458 456 457 458
        // 121 121 122 123
        // 122 122 123
        // 123 123
        // 124 none
        // 3 - 9 -> 3 (4 - 7) ^8-9
        // 1 - 15 -> 1-3 (4 - 15)
        // 20 - 60 -> 4-7 8-11
        // 123 - 456 -> 124- 455
        // 000 0
        // 001
        // 010 2
        // 011
        // 100 4
        // 101
        // 110
        // 111
        // 1000 8
        // 1001
        // 1010
        // 1011
        // 1100
        // 1101
        // 1110
        // 1111
        // 10000
        // 10001
        // 16 32 64
        
        System.out.println(num);
    }
}