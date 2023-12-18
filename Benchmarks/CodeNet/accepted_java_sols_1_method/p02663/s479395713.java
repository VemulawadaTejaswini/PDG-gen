import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        System.out.println((n2 - n) * 60 + (m2 - m) - k);

        sc.close();
    }

}
