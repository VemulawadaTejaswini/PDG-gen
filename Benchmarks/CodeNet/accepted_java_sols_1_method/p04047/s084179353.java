import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); Integer [] a = new Integer[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        int ans = 0;
        for (int i = 1; i < 2 * n; i += 2) ans += a[i];
        System.out.println(ans);
    }


}