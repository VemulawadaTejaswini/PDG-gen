import java.util.Scanner;
public class Main
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] x=new int[m];
        for(int a=0;a<m;a++)
        {
            x[a]=sc.nextInt();
            n=n-x[a];
        }
        
        if (n<0)
        System.out.println("-1");
        if(n>=0)
        System.out.println(n);
    }
}