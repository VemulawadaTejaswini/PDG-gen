import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        long sum = 0;
        for(int i=0; i<=num; i++)
        {
            
            if(i % 3 == 0 || i % 5 == 0)
                continue;
            else
            {
                sum = sum + i;
            }
                
            
        }
        System.out.println(sum);
    }
}