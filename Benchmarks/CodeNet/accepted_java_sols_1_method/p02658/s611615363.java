import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }

        Arrays.sort(arr);
        long ans=1;
        if(arr[0]==0)
        {
            System.out.println(0);
        }
        else
        {
            boolean flag=false;
            for(int i=n-1;i>=0;i--)
            {

                if(arr[i]>1000000000000000000l/ans)
                {
                    System.out.println(-1);
                    flag=true;
                    break;
                }
                ans=ans*arr[i];
            }
                if(!flag)
                {
                    System.out.println(ans);
                }

        }
    }
}
