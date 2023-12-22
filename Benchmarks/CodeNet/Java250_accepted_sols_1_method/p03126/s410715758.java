import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] kinds = new int[m];

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            for (int j = 0; j < count; j++) {
                int value = sc.nextInt();
                kinds[value - 1]++;
            }
        }

        int ret = 0;
        for (int i = 0; i < m; i++) {
            if (kinds[i] == n) {
                ret++;
            }
        }
        System.out.println(ret);
    }

}