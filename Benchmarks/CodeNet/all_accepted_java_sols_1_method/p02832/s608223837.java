import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] input = new int[n];
        int counter = 0  ;
        
        for(int i = 0;i<n;i++)
        {
            input[i] = sc.nextInt();
        }
        
        for(int i = 0;i<n;i++)
        {
            if(input[i] == counter+1)
            {
                counter ++ ;
            }
        }
        
        if(counter != 0)
        {
            System.out.println(n-counter);
        }
        else
        {
            System.out.println((-1));
        }
    }
}
