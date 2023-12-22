import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        int count=0;
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                for(int k=j+1;k<x;k++)
                {
                    int a=arr[i];
                    int b=arr[j];
                    int c=arr[k];
                    if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i])
                    {
                        if((a+b<=c)||(a+c<=b)||(b+c<=a))
                        {
                            continue;
                        }
                        else
                        {
                            count++;
                        }
                    }
                }
            }
        }
    System.out.println(count);

    }
}