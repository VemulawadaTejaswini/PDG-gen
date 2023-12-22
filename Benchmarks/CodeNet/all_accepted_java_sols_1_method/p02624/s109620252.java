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
        int n=sc.nextInt();
        long arr[]=new long[(int)n+1];
        for(int i=1;i<n+1;i++)
        {
            for (int j = i; j < n+1; j=j+i)
            {
                arr[j]=arr[j]+1;
            }
        }

        long ans=0;
        for(int i=1;i<n+1;i++)
        {
            ans=ans+i*arr[i];
        }
        System.out.println(ans);
    }
}
