
import java.util.Scanner;

class Main {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();
        int WH = gcd(W, H);
       
        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}
