import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n, m, a[] = new int[102], total = 0, minval;
        n = get.nextInt();
        m = get.nextInt();
        for(int i = 1; i <= n; ++i) {
            a[i] = get.nextInt();
            total += a[i];
        }
        minval = total / (4 * m);
        if(total % (4 * m) > 0) ++minval;
        int maxAmount = 0;
        for(int i = 1; i <= n; ++i) {
            if(a[i] >= minval) {
                ++maxAmount;
            }
        }
        if(maxAmount >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}