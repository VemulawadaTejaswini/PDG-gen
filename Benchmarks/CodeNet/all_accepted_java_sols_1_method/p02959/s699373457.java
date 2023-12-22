import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int[] b=new int[n];
        for(int i=0;i<=n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)b[i]=sc.nextInt();

        long count=0;

        for(int i=n-1;i>=0;i--){
            for(int j=1;j>=0;j--){

                int x = a[i + j];
                int y = b[i];

                int m=Math.min(y,x);

                count=count+m;
                b[i]=b[i]-m;
                a[i+j]=a[i+j]-m;
            }
        }
        System.out.println(count);

    }

}

