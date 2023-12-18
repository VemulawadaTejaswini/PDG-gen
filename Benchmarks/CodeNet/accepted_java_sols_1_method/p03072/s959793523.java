import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[] hh = new int[h];
        for (int i = 0; i < h; i++) {
            hh[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            int hei = hh[i];
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (hh[j] <= hei) {

                } else {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();

    }
}