import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        double a = t * Math.ceil((double)n/x);
        System.out.println((int)a);
    }
}