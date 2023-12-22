import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        //        boolean ans = false;

        int count = 0;
        int[] a = new int[n];

        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C')
                count++;
            a[i] = count;
        }

        //        if (1200 <= n)
        //            ans = true;

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(a[r - 1] - a[l - 1]);
        }
        sc.close();
        //        System.out.println(ans ? "Yes" : "No");

    }
}