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
        int cases = 5;
        int arr[] = new int[5];
        int ans=0;
        for(int i=0;i<cases;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]==0)
            {ans=i+1;}
            //int arr[] = new int[n];
        }
        System.out.println(ans);



    }
}
