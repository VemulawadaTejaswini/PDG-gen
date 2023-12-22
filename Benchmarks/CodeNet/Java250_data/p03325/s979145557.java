import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        long ans=0;
        for (int i = 0; i < n; i++) {
            int temp=0;
            int t=arr[i];
            if(t%2==0) {
                while (t %2==0) {
                    t = t / 2;
                    temp++;
                }
            }
            ans+=(long)temp;
        }
        System.out.println(ans);

    }

}