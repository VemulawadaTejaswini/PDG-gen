import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n | m) == 0)
                break;
            int[] taro = new int[n];
            int[] hanako = new int[m];
            int taro_sum = 0;
            int hanako_sum = 0;
            for (int i = 0; i < n; i++)
                taro_sum += (taro[i] = sc.nextInt());
            for (int i = 0; i < m; i++)
                hanako_sum += (hanako[i] = sc.nextInt());
            int diff = taro_sum - hanako_sum;
            if (diff % 2 != 0)
                System.out.println(-1);

            else {
                int min = 201;
                String ans = new String();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (diff / 2 == (taro[i] - hanako[j])) {
                            if (min > taro[i] + hanako[j]) {
                                min = taro[i] + hanako[j];
                                ans = taro[i] + " " + hanako[j];
                            }
                        }

                    }
                }
                if (min == 201)
                    ans = "-1";
                System.out.println(ans);
            }
        }
    }
}