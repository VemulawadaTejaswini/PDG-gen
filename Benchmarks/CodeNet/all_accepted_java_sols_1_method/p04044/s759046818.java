import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] sArr = new String[n];

        for (int i = 0; i < n; i++) {
            sArr[i] = sc.next();
        }

        Arrays.sort(sArr);

        String res = "";
        for (int i = 0; i < n; i++) {
            res += sArr[i];
        }

        System.out.println(res);
    }
}
