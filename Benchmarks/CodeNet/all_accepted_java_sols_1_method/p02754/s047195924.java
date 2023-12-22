import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        long num = key.nextLong();
        long blue = key.nextLong();
        long red = key.nextLong();
        
        long total = num % (blue+red);
        long rem = (num - total)/(blue+red)*blue;

        if(total - blue >= 0)
        {
            rem = rem + blue;
        }
        else
        {
            rem = rem + total;
        }

        System.out.println(rem);


    }
}