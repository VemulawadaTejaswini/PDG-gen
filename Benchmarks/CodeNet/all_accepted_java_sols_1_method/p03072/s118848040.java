import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int maxHeight = 0;
        int ans = 0;
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            if (h >= maxHeight) ans++;
            maxHeight = Math.max(maxHeight, h);
        }
        System.out.println(ans);
    }
}
