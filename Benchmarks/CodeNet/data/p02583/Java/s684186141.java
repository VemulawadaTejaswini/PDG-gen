import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(l);
        int ans = 0;

        if (n < 3) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < l.length - 2; i++) {
            for (int j = i + 1; j < l.length - 1; j++) {
                if (l[i] == l[j]) {
                    continue;
                }

                for (int k = j + 1; k < l.length; k++) {
                    if (l[j] == l[k]) {
                        continue;
                    }
                    if ((l[i] + l[j]) > l[k]) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}