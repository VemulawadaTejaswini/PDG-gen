import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int num = 1;

        for(int i = 2; i <= 31; i++)
        {
            for(int j = 10; j > 1; j--)
            {
                double tmp = Math.pow(i, j);
                if(tmp <= x && tmp > num) num = (int) tmp;
            }
        }
        System.out.print(num);
        scan.close();
    }
}