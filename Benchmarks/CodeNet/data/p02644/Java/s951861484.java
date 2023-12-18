import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int h=Integer.parseInt(str[0]);
        int w=Integer.parseInt(str[1]);
        int k1=Integer.parseInt(str[2]);
        str=br.readLine().split(" ");
        int x1=Integer.parseInt(str[0])-1;
        int y1=Integer.parseInt(str[1])-1;
        int x2=Integer.parseInt(str[2])-1;
        int y2=Integer.parseInt(str[3])-1;
        char arr[][]=new char[h][w];
        int fill[][]=new int[h][w];
        for(int i=0;i<h;i++)
        Arrays.fill(fill[i],Integer.MAX_VALUE);
        for(int i=0;i<h;i++)
        arr[i]=br.readLine().toCharArray();
        Queue<String> queue=new LinkedList<>();
        queue.add(x1+" "+y1);
        boolean vis[][]=new boolean[h][w];
        vis[x1][y1]=true;
        fill[x1][y1]=0;
        while(!queue.isEmpty())
        {
            String s=queue.poll();
            int x=Integer.parseInt(s.split(" ")[0]);
            int y=Integer.parseInt(s.split(" ")[1]);
            int cnt=0,j=x-1,k=y;
            while(cnt<k1&&j>=0&&arr[j][k]!='@')
            {
                fill[j][k]=Math.min(fill[x][y]+1,fill[j][k]);
                if(!vis[j][k])
                {
                    vis[j][k]=true;
                    queue.add(j+" "+k);
                }
                cnt++;
                j--;
            }
            cnt=0;
            j=x+1;
            while(cnt<k1&&j<h&&arr[j][k]!='@')
            {
                fill[j][k]=Math.min(fill[x][y]+1,fill[j][k]);
                if(!vis[j][k])
                {
                    vis[j][k]=true;
                    queue.add(j+" "+k);
                }
                cnt++;
                j++;
            }
            cnt=0;
            j=x;
            k=y-1;
            while(cnt<k1&&k>=0&&arr[j][k]!='@')
            {
                fill[j][k]=Math.min(fill[x][y]+1,fill[j][k]);
                if(!vis[j][k])
                {
                    vis[j][k]=true;
                    queue.add(j+" "+k);
                }
                cnt++;
                k--;
            }
            cnt=0;
            k=y+1;
            while(cnt<k1&&k<w&&arr[j][k]!='@')
            {
                fill[j][k]=Math.min(fill[x][y]+1,fill[j][k]);
                if(!vis[j][k])
                {
                    vis[j][k]=true;
                    queue.add(j+" "+k);
                }
                cnt++;
                k++;
            }
        }
        if(fill[x2][y2]==Integer.MAX_VALUE)
        pw.println(-1);
        else
        pw.println(fill[x2][y2]);
        pw.flush();
        pw.close();
    }
}