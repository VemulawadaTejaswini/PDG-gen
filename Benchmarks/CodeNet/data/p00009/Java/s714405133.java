import java.util.Scanner;

class Main
{
    public static void main(String[] a)
        {
            Scanner scan = new Scanner(System.in);
            int num, count = 0, n, q;
            boolean flag;
            while (scan.hasNext()) {
                num = scan.nextInt();
                if (num >= 2) {
                    count++;
                }
                for (n = 3; n <= num; n += 2) {
                    flag = true;
                    for (q = 3; q <= Math.sqrt(n); q += 2) {
                        if (n % q == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
}