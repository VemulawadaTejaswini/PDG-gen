import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();

        int n = (R - L) / d;
        if(R % d == 0)
        n = n + 1;
    System.out.println(n);

    }
}