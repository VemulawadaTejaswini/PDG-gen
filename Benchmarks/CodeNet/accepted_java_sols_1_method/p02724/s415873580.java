import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        
        int points_500 = 0;
        int points_5 = 0;

        while(num > 5)
        {
            
            if(num > 499)
            {
                points_500 = num/500;
                num = num % 500;
            }
            else
            {
                points_5 = num/5;
                num = num%5;
            }

            
        }
        System.out.println((points_5 * 5) + (points_500 *1000));
    }
}