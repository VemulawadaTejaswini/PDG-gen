import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += sc.nextInt();
        }
        System.out.println(a < h ? "No" : "Yes");
        sc.close();

    }

}
