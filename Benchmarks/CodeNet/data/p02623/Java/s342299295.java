import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static int binarySearch(long[] arr,long n)
    {
        //#aaRJae
        //This is a basic  binary search code(return -1 if not found)
        //returns index of number
        // binary search has infinite variation so beware
        //To make search for number just greater than the value "n" decomment comment just below "1&&3"
        //return -1 if value greater than last integer
        //To make search for number just less than the value "n" decomment comment just below "2&&3"
        //returns -1 if value less than last integer
        int len =arr.length;
        int l = 0;
        int r = len-1;
        int mid;
        //3
        int ans =-1;


        while(r>=l)  //"=" lagana hai bhai
        {
            mid = l+(r-l)/2;  //never (l+r)/2 kyunki integer overflow
            if(arr[mid]==n)
            {
                //3
                ans =mid;
                return mid;

            }
            if(arr[mid]>n)
            {
                r =mid-1;
                //1
                //ans = mid;
            }
            else
            {
                l =mid+1;
                //2
                ans = mid;
            }
        }
        //3 make return -1 commented
        return ans;
        //return -1;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long arrn[]=new long[n];
        long prefn[]=new long[n+1];
        for(int i=0;i<n;i++)
        {
            arrn[i]=sc.nextLong();
            prefn[i+1]=prefn[i]+arrn[i];
        }
        long arrm[]=new long[m];
        long prefm[]=new long[m+1];
        for(int i=0;i<m;i++)
        {
            arrm[i]=sc.nextLong();
            prefm[i+1]=prefm[i]+arrm[i];
        }

        long ans=0;
        for(int i=0;i<n+1;i++)
        {
            long search=k-prefn[i];
            if(search>=0) {
                long s = binarySearch(prefm, search);
                if(s>=0) {
                    ans = Math.max(s + i, ans);
                }
            }
        }
        System.out.println(ans);

    }
}
