import java.util.Arrays;
import java.util.Scanner;
 
public class Main
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        int a[]=new int[100+1];
        Arrays.fill(a, 0);
 
        while(scan.hasNext())
        {
            int in = scan.nextInt();
            a[in]++;
        }
 
        int max = 0;
        for(int i=1; i<a.length; i++)
        {
            if(max <=a[i])
                max=a[i];
        }
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==max)
                System.out.println(i);
        }
 
    }
 
}
