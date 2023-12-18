import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        if (n % (d * 2 + 1) == 0)
            System.out.println(n / (d * 2 + 1));
        else
            System.out.println(n / (d * 2 + 1) + 1);
    }
}