import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] a = scan.next().toCharArray();
        int ans = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && a[i] == 'R') i++;
            while (i < j && a[j] == 'W') j--;
            if (i < j) {
                ans++;
                i++; j--;
            }
        }
        System.out.println(ans);
    }
}
