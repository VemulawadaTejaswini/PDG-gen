import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((t * a) < b) {
            System.out.println((t * a));
        } else {
            System.out.println(b);
        }
    }
}
