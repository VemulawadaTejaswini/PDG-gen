import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int min = 10;
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            if(a[i] % 10 != 0){
                min = Math.min(min, a[i] % 10);
            }
            ans += (a[i] + 9) / 10 * 10;
        }
        if(min != 10) ans -= (10 - min);
        System.out.println(ans);
        sc.close();
    }

}
