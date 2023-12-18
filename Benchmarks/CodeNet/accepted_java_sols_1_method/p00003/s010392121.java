import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ary[] = new int[3];

        int n = sc.nextInt();
        while (n-- > 0) {
            for (int i = 0; i < ary.length; i++)
                ary[i] = sc.nextInt();

            Arrays.sort(ary);

            int a = ary[0];
            int b = ary[1];
            int c = ary[2];

            System.out.println((a*a + b*b == c*c) ? "YES" : "NO");
        }
    }
}