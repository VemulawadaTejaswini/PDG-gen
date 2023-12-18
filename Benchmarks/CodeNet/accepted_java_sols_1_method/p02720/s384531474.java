//created by Whiplash99
import java.io.*;
import java.util.*;
import java.util.function.BiPredicate;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        long count[][]=new long[10][20];
        for(i=0;i<10;i++)
        {
            count[i][1] = 1;
            count[i][2]=3;
        }
        count[0][2]=count[9][2]=2;

        for(i=3;i<=12;i++)
        {
            count[0][i]=count[0][i-1]+count[1][i-1];
            count[9][i]=count[8][i-1]+count[9][i-1];

            for(int j=1;j<=8;j++) count[j][i]=count[j-1][i-1]+count[j][i-1]+count[j+1][i-1];
        }

        long digits[]=new long[20];
        for(i=1;i<=12;i++)
        {
            for(int j=1;j<=9;j++) digits[i]+=count[j][i];
        }

        int K=Integer.parseInt(br.readLine().trim());
        int cur=0;

        for(i=1;i<=12;i++)
        {
            if (digits[i] >= K) break;
            K-=digits[i];
        }
        cur=i;

        int prev=0;
        char str[]=new char[cur];
        for(i=0;i<cur;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if (i == 0 && j == 0) continue;
                if(i!=0&&Math.abs(prev-j)>1) continue;

                if (count[j][cur - i] >= K)
                {
                    str[i]=(char)(48+j);
                    prev=j;
                    break;
                }
                else K-=count[j][cur-i];
            }
        }
        System.out.println(new String(str));
    }
}