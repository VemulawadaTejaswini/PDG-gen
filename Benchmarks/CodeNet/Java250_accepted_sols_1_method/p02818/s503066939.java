import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        if(a < c) {
            c -= a;
            a = 0;
            if(b < c) {
                b = 0;
            } else {
                b -= c;
            }
        } else {
            a -= c;
        }
        System.out.println(a + " " + b);
    }
}
