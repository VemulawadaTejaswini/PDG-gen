import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        int answer2 = 0;
        
        if (x * 2 == w && y * 2 == h) {
            answer2 = 1;
        }
        
        double answer = (double)w / 2 * h;
        
        // if (x == 0 && y == 0) {
        //     answer2 = 1;
        // } else if (x == w && y == h) {
        //     answer2 = 1;
        // }
        // 899999999999
        // 1000000000
        //  999999999
        
        System.out.println(answer + " " + answer2);
    }
}
