import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long a = Long.parseLong(s.next());
        long b = Long.parseLong(s.next());
        long c = Long.parseLong(s.next());
        long k = Long.parseLong(s.next());

        if (k <= a) {
            System.out.println(k);
        } else if(a + b >= k) {
            System.out.println(a);
        } else {
            System.out.println(a - (k - a - b));
        }
    }
}
