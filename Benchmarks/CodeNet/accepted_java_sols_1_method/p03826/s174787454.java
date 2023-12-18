import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int ab = a * b;
        int cd = c * d;
        int s = ab > cd ? ab : cd;
        
        System.out.println(s);
    }
}
