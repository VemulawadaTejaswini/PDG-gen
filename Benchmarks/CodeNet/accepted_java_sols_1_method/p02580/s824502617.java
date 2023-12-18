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
        int h=sc.nextInt();
        int w=sc.nextInt();
        int m=sc.nextInt();
        Map<String,Integer> map=new HashMap<>();
        int r[]=new int[h];
        int c[]=new int[w];
        int marr[][]=new int[m][2];
        for(int i=0;i<m;i++)
        {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            marr[i][0]=x;
            marr[i][1]=y;
            map.put(x+" "+y,1);
            r[x]++;
            c[y]++;
        }
//        Arrays.sort(r);
//        Arrays.sort(c);
        //System.out.println((r[h-1]+c[w-1]));
        int mr=0;
        int mc=0;
        for(int i=0;i<h;i++)
        {
            mr=Math.max(mr,r[i]);
        }
        for(int i=0;i<w;i++)
        {
            mc=Math.max(mc,c[i]);
        }

        int s1=0;
        int s2=0;
        for(int i=0;i<h;i++)
        {
            if(r[i]==mr)
            {
                s1++;
            }
        }
        for(int i=0;i<w;i++)
        {
            if(c[i]==mc)
            {
                s2++;
            }
        }
        int ans=mc+mr;
        long d=0;
        for(int i=0;i<m;i++)
        {
            if(r[marr[i][0]]+c[marr[i][1]]==(mc+mr))
            {
                d++;
            }
        }
        if((long)(d)<((long)s1)*((long)s2))
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println(ans-1);
        }

    }
}
