import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        Arrays.sort(strArr);
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += strArr[i];
        }

        System.out.println(ans);
    }
}
