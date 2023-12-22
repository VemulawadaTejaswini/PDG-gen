import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        long sum = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i =1; i<=num ; i++)
        {
            for(int j = 1 ; j<=num ; j++)
            {
                for(int k = 1; k<=num; k++)
                {
                    a = i;
                    b = j;
                    c = k;
                    int min = Math.min(a,b);
                    min = Math.min(min,c);
                    end:
                    for(int l = min; l>=1; l--)
                    {
                        if((a % l == 0) && (b % l == 0 )&& (c % l == 0))
                        {
                            min = l;
                            break end;
                        }
                    }
                    
                    
                    sum = sum +min;
                    
                    
                    
                }
            }
        }
        System.out.println(sum);
    }
}