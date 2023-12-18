import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        int ans = 0;
        for (int i = 0; i < aArr.length; i++) {
            x -= aArr[i];
            if (x < 0) break;
            ans++;
        }

        if (x > 0) {
            System.out.println(ans - 1);
        } else {
            System.out.println(ans);
        }


    }
}
