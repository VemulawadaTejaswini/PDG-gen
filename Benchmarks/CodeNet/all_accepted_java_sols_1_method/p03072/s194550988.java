import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int temp;
        int count=0;
        for(int i=0;i<n;i++)
        {
            temp=arr[0];
            for(int j=0;j<i;j++)
            {
                if(arr[j]>temp)
                    temp=arr[j];
            }
            if(arr[i]>=temp)
                count++;
        }
        System.out.println(count);
    }
}
