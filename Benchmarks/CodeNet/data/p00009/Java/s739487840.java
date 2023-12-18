import java.util.Scanner;

class Main
{
    public static void main(String[] a)
        {
            Scanner scan = new Scanner(System.in);
            int num =  scan.nextInt();
            int count = 0;
            if (num >= 2) {
                count++;
            }
            boolean flag;
            for (int n = 3; n <= num; n += 2) {
                flag = true;
                for (int q = 3; q <= Math.sqrt(n); q += 2) {
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