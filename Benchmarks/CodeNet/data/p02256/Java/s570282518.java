import java.util.Scanner;

public class Main {
    public static int gcd(int p,int q){
        if(q == 0)
            return p;
        int r = p % q;
        return gcd(q,r);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int c = gcd(a,b);
        System.out.println(c);
    }
}
