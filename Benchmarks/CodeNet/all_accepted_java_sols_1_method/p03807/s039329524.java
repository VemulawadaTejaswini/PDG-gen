import java.util.Scanner;

/**
 * Created by wenjian on 2017/2/4.
 */
public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; ++i) a[i] = reader.nextInt();
        int sum = 0;
        for (int i=0; i<a.length; ++i) {
            if (a[i] % 2 == 1) ++sum;
        }
        if (sum % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}