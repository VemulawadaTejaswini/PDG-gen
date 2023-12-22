import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();

        int eat = Integer.MAX_VALUE;
        int eat_c = Integer.MAX_VALUE;
        int[] a = new int[N];
        int cnt = 0;
        for (int i = 1; i < N + 1; i++) {
            a[cnt] = L + i -1;
            int temp = 0;
            if (a[cnt] < 0 ) {
                temp = a[cnt] * -1;
            } else {
                temp = a[cnt];
            }

            int min = Math.min(eat_c, temp);
            if (min < eat_c) {
                eat =  a[cnt];
                eat_c =  min;
            }
            cnt++;
        }
        int count = 0;
        boolean eatFlag = false;
        for (int i = 0; i < N; i++) {
            if (a[i] == eat && !eatFlag) {
                eatFlag = true;
                continue;
            }
            count += a[i];
        }
        System.out.println(count);
    }
}
