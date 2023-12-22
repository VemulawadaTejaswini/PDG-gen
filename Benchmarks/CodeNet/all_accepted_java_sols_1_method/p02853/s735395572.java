import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] prize = {300000, 200000, 100000};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = (x == 1 && y == 1) ? 400000 : 0;
        --x;
        --y;
        if(x < 3) ans += prize[x];
        if(y < 3) ans += prize[y];
        System.out.println(ans);
    }
}
