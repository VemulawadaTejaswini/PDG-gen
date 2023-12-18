import java.util.*;
import java.math.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max = 1000;
        if(n==0 || n==1)
        {
            System.out.println("1000");
        }
        else
        {
            int initial = 1000;
            int day;
            for(day=0;day<n-1;day++)
            {
                if(arr[day]<arr[day+1])
                {
                    break;
                }
            }
            int curr = 1000;
            int stock = curr/arr[day];
            curr -=stock*arr[day];
            int lastvisit = day;
            for(int i=day+1;i<n;i++)
            {
                if(arr[i-1]<=arr[i])
                {
                    continue;
                }
                else
                {
                    curr +=arr[i-1]*stock;
                    max = Math.max(curr,max);
                    stock = curr/arr[i];
                    curr -=stock*arr[i]; 
                    lastvisit = i;
                }
            }
            if(lastvisit!=(n-1))
            {
            curr +=stock*arr[n-1];
            max = Math.max(max,curr);
            }
            System.out.println(max);

        }

    }
}