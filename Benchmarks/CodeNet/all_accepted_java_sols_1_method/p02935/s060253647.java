import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        double sum=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();

        }
        Arrays.sort(arr);
        sum=arr[0];
 for (int i=0;i<n-1;i++)

            sum=(sum+arr[i+1])/2;

        System.out.println(sum);
    }
}
