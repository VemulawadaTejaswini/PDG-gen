import java.util.Scanner;

public class Main {
    static int gcd(int a, int b)
    {
        if(a == 0 || b == 0) return a+b;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner input1 =  new Scanner(System.in);
        int a = input1.nextInt();
        int b = input1.nextInt();
        System.out.println(gcd(a,b));
    }
}
