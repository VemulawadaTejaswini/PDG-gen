import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        ans += sc.nextInt();
        ans += sc.nextInt();
        ans += sc.nextInt();
        System.out.println(ans < 22 ? "win" : "bust");
        sc.close();

    }

}
