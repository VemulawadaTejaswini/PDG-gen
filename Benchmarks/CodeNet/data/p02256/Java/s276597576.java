import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

    }

    public static int gcd(int x, int y){
        int r;
        if (x < y) {
            swap(x, y);
        }
        while (y > 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    public static void swap(int a,int b)

    {

        int temp=a;

        a=b;

        b=temp;

    }
}
