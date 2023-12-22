import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] count = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                count[i] = 0;
                continue;
            }
            int e = 0;
            if (S.charAt(i-1) == 'A' && S.charAt(i) == 'C') {
                e++;
            }
            count[i] = count[i-1] + e;
        }
        for (int i = 0; i < Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(count[r - 1] - count[l - 1]);
        }
    }
}