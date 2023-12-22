import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 1;
        int B = 0;
        int C = -1;
        int a,b,c;
        int n;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        if(a + b >= n)
        {
            System.out.println(Math.min(a,n)*A);
        }
        else
        {
            System.out.println((n-(a+b))*C+ a*A);
        }
    }
}
