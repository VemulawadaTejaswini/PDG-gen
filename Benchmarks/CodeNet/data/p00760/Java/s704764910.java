import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.err.println(convert(1,1,1));
//        System.err.println(convert(1,10,19));
//        System.err.println(convert(2,1,1));
//
//        System.err.println(convert(2,10,19));
//        System.err.println(convert(3,1,1));
//        System.err.println(convert(3,10,20));
//        System.err.println(convert(4,1,1));
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(convert(1000,1,1) - convert(y, m, d));
        }
    }
    
    static int convert(int y, int m, int d) {
        int v19 = 0, v20 = 0;
        y -= 1;
        m -= 1;
        v19 += (y/3 * 2 + y%3)* 5;
        v20 += y/3 * (5+5+10) + y%3 * 5;
        if (y%3 == 2) {
            v20 += m;
        } else {
            v19 += m/2;
            v20 += (m+1)/2;
        }
        return v19 * 19 + v20 * 20 + d;
    }
}