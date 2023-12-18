import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int k;
        String[] a;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        a = sc.nextLine().split(" ");

        int one = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("1")) one = i;
            break;
        }
        int left = one;
        int right = a.length - one - 1;
        if (left % (k - 1) > 0) left += k - 1;
        if (right % (k - 1) > 0) right += k - 1;

        int ans = Math.max(left / (k - 1), right / (k - 1));
        System.out.println(ans);
    }
}