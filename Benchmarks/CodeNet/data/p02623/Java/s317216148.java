import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String first[] = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        int k = Integer.parseInt(first[2]);
        
        String str[] = br.readLine().split(" ");
        String str1[] = br.readLine().split(" ");
        
        int arr[] = new int[str.length];
        for(int i=0;i<arr.length;i++)
            arr[i] = Integer.parseInt(str[i]);
        
        int arr1[] = new int[str1.length];
        for(int i=0;i<arr1.length;i++)
            arr1[i] = Integer.parseInt(str1[i]);
        
        int ans=0;
        
        int aL = arr.length-1;
        int a2L = arr1.length-1;
        
        int i = 0,j = 0;
        
        while(k>0)
        {
            if(i>aL && j > a2L)
            {
                break;
            }
            if(i>aL && j<=a2L)
            {
                if(arr1[j]<=k)
                {
                    k = k-arr1[j];
                    ans++;
                    j++;
                }
                else
                {
                    j = a2L+1;
                }
            }
            else if(j>a2L && i<=aL)
            {
                if(arr[i]<=k)
                {
                    k = k-arr[j];
                    ans++;
                    i++;
                }
                else
                {
                    i = aL+1;
                }
            }
            else
            {
                if(arr[i]<=k && arr[i] < arr1[j])
                {
                    
                        ans++;
                        k-=arr[i];
                        i++;
                    
                }
                else if(arr[i]>k)
                {
                    i = aL+1;
                }
                else if(arr1[j]<=k && arr1[j]<arr[i])
                {
                    ans++;
                    k-=arr1[j];
                    j++;
                }
                else
                {
                    j = a2L +1;
                }
            }
        }
        System.out.println(ans);
        
    }
}