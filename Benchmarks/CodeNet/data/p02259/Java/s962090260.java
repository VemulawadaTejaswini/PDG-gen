import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(bubbleSort(a, n));
        sc.close();
    }

    static StringBuilder bubbleSort(int[] a, int n) {
        int ans = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; i--) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    ans++;
                    flag = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != 0)
                sb.append(" ");
            sb.append(a[i]);
        }
        sb.append(System.lineSeparator() + ans);

        return sb;
    }
}
