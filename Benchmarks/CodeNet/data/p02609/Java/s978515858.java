import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] x = sc.next().toCharArray();
        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (x[i] == '1') {
                c++;
            }
        }
        int a = c - 1;
        int b = c + 1;
        int[] aa = new int[n];
        int[] ba = new int[n];
        int z = 1;
        if (a >= 1) {
            for (int i = 0 ; i < n ; i++) {
                z %= a;
                aa[i] = z;
                z *= 2;
            }
        }

        z = 1;
        for (int i = 0 ; i < n ; i++) {
            z %= b;
            ba[i] = z;
            z *= 2;
        }
        int d = 0;
        int e = 0;
        for (int i = 0 ; i < n ; i++) {
            if (x[i] == '1') {
                d += aa[n - i - 1];
                e += ba[n - i - 1];
            }
        }

        for (int i = 0 ; i < n ; i++) {
            int ans = 0;
            if (x[i] == '1') {
                int temp = d - aa[n - i - 1];
                int moda = a;
                while (temp > 0 && moda > 0) {
                    temp %= moda;
                    int temp2 = temp;
                    int cnt = 0;
                    while (temp2 > 0) {
                        if (temp2 % 2 == 1) {
                            cnt++;
                        }
                        temp2 /= 2;
                    }
                    moda = cnt;
                    ans++;
                }
            } else {
                int temp = e + ba[n - i - 1];
                int modb = b;
                while (temp > 0 && modb > 0) {
                    temp %= modb;
                    int temp2 = temp;
                    int cnt = 0;
                    while (temp2 > 0) {
                        if (temp2 % 2 == 1) {
                            cnt++;
                        }
                        temp2 /= 2;
                    }
                    modb = cnt;
                    ans++;
                }
            }
            System.out.println(ans);
        }


    }

}