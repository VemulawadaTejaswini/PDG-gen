import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int h[] = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        boolean mizuyari = true;
        int count = 0;
        int nowh[] = new int[N];
        while (mizuyari) {
            mizuyari = false;
            for (int i = 0; i < N; i++) {
                if (nowh[i] < h[i]) {
                    mizuyari = true;
                    nowh[i] = nowh[i] + 1;
                } else {
                    if (mizuyari) {
                        break;
                    }
                }
            }
            if (mizuyari) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}