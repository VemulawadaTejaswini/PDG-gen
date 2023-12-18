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


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int p=10000;
        int ans=10000;
        Map<Integer,Integer> map=new HashMap<>();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            map.put(arr[i],1);
        }

        for(int i=1000;i>=0;i--)
        {
            int k=i-x;
            if(k<0)
            {
                k=-k;
            }
            if((k<=p)&&map.get(i)==null)
            {
                ans=i;
                p=k;
            }
        }
        System.out.println(ans);

    }
}
