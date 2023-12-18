import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[30];
        
        while(scan.hasNext())
        {
            int n = scan.nextInt();
            if(n==0)
                break;
            fact(n,n,array,0);
        }
    }
    
    public static void fact(int n, int num, int[] array, int count)
    {
        if(num<=0)
        {
            System.out.print(array[0]);
            for(int i=1;i<count;i++)
            {
                System.out.print(" "+array[i]);
            }
            System.out.println();
        }
        else
        {
            for(int i=min(n,num);i>0;i--)
            {
                array[count]=i;
                fact(i,num-i,array,count+1);
            }
        }
           
    }

    public static int min(int a, int b)
    {
        if(a>b)
            return b;
        else
            return a;
    }
}