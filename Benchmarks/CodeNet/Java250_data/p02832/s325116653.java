import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }

        int hit = 0;
        int count = 0;
        int expected = 1;
        for (int i = 0; i < n; i++) {
            if (xs[i] == expected) {
                hit++;
                expected++;
            }
            else {
                count++;
            }
        }

        if (hit == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(count);
        }
    }
}
