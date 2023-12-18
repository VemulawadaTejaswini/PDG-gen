import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b - a;
        long x = n * (n+1) / 2 - b;
        System.out.println(x);
    }
}