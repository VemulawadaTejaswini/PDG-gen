import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt();
        int a = sc.nextInt();
        int ans = (h % a == 0) ? h / a : h / a + 1;
        System.out.println(ans);
    }
}