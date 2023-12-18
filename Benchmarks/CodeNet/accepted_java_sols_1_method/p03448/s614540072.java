import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int ia = 0; ia <= a; ia++) {
            for (int ib = 0; ib <= b; ib++) {
                for (int ic = 0; ic <= c; ic++) {
                    if (500 * ia + 100 * ib + 50 * ic == x) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
   }
}
