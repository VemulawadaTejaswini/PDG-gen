import java.util.Scanner;

public class Main{
    
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = gcd(a, b);
        System.out.println(n);
    }
}
