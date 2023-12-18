//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;
        long ans=0;

        String s[]=br.readLine().trim().split(" ");
        int H=Integer.parseInt(s[0]);
        int W=Integer.parseInt(s[1]);
        int K=Integer.parseInt(s[2]);

        char str[][]=new char[H][W];
        for(i=0;i<H;i++) str[i]=br.readLine().trim().toCharArray();

        N=1<<(H+W);

        int row[]=new int[H];
        int col[]=new int[W];

        for(i=0;i<N;i++)
        {
            Arrays.fill(row,0);
            Arrays.fill(col,0);

            int count=0,tmp=i;
            while (tmp>0&&count<H)
            {
                row[count++]=tmp&1;
                tmp>>=1;
            }

            count=0;
            while (tmp>0&&count<W)
            {
                col[count++]=tmp&1;
                tmp>>=1;
            }

            tmp=0;
            for(int x=0;x<H;x++)
            {
                for(int y=0;y<W;y++)
                {
                    if(row[x]==1||col[y]==1) continue;
                    if(str[x][y]=='#') tmp++;
                }
            }
            if(tmp==K) ans++;
        }
        System.out.println(ans);
    }
}