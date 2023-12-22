import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] a = new int[n + 2];
        a[0] = 0;
        a[n + 1] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = cin.nextInt();
        }
        int x = 0;
        int pre_part_exp = 0;
        int end_part_exp = 0;
        for (int i = 2; i <= n + 1; i++) {
            end_part_exp += Math.abs(x - a[i]);
            x = a[i];
        }
        System.out.println(end_part_exp);
        for (int i = 2; i <= n; i++) {
            end_part_exp = end_part_exp
                           - Math.abs(a[i + 1] - a[i])
                           - Math.abs(a[i] - a[i - 2])
                           + Math.abs(a[i + 1] - a[i - 1]);
            pre_part_exp += Math.abs(a[i - 1] - a[i - 2]);
            System.out.println(pre_part_exp + end_part_exp);
        }
    }
}
