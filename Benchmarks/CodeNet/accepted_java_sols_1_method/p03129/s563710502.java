import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        if (n - k >= k - 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
