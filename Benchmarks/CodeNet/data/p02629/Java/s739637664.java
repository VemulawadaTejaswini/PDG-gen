

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int curLayer = 1;
        int layers = 0;
        for (layers = 1; ; layers ++ ) {
            curLayer *= 26;
            if (curLayer >= n) break;
            n -= curLayer;

        }


        n -- ;

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < layers; i ++ ) { 
            res.append((char)('a' + n % 26));
            n /= 26;
        }
        res.reverse();
        System.out.println(res.toString());

    }
}
