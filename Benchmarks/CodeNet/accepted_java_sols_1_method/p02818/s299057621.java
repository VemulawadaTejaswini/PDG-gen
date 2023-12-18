import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a,b,k;
        a = Long.parseLong(sc.next());
        b = Long.parseLong(sc.next());
        k = Long.parseLong(sc.next());

        if(k <= a) {
            System.out.print(a-k);
            System.out.print(" ");
            System.out.print(b);
        } else if (a < k && k <= a+b) {
            System.out.print(0);
            System.out.print(" ");
            System.out.print(b+a-k);
        } else {
            System.out.print(0);
            System.out.print(" ");
            System.out.print(0);
        }
    }
}
