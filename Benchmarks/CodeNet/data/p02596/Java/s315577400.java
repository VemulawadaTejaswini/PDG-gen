import java.util.Scanner;

//解説を参考
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] a = new int[1000001];
        a[1] = 7 % k; //初項

        if (k % 2 != 0) {
            for (int i = 2; i <= k; i++)
                a[i] = (10 * a[i - 1] + 7) % k;

            for (int i = 1; i <= k; i++) {
                if (a[i] == 0) {
                    System.out.println(i);
                    break;
                }
            }
            System.out.println(-1);
        } else
            System.out.println(-1);
    }

}
