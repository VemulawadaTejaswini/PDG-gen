import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(gcd(x,y));
    }
    
    public static int gcd(int x, int y) {
        int tmp = x % y;
        if (tmp == 0) {
            return y;
        }
        return gcd(y, tmp);
    }
}