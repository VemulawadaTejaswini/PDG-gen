import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ans=ans^arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=ans^arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr1[i]);
        }

    }
}