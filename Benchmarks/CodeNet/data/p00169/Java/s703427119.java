import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String[] s = sc.nextLine().split(" ");
            int n = s.length;
            int[] l = new int[n];
            for (int i = 0; i < n; i++) 
                l[i] = Integer.parseInt(s[i]);
            if (l[0] == 0)
                break;
            Arrays.sort(l);
            int sum = 0;
            while (n-- > 0)
                sum+=l[n]!=1?Math.min(10,l[n]):sum+n<=10?11:1;
            System.out.println(sum>21?0:sum);
        }
    }
}
