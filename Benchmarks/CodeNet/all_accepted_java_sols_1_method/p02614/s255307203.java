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
        int k=Integer.parseInt(str[2]);
        char carr[][]=new char[h][w];
        for(int i=0;i<h;i++)
        carr[i]=br.readLine().toCharArray();
        int b=0;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(carr[i][j]=='#')
                b++;
            }
        }
        ArrayList<String> sub1=new ArrayList<>();
        ArrayList<String> sub2=new ArrayList<>();
        for(int i=0;i<(1<<h);i++)
        {
            StringBuffer sb=new StringBuffer();
            for(int j=0;j<h;j++)
            {
                if((i&(1<<j))>0)
                {
                    sb.append(j);
                    sb.append(' ');
                }
            }
            sub1.add(sb.toString());
        }
        for(int i=0;i<(1<<w);i++)
        {
            StringBuffer sb=new StringBuffer();
            for(int j=0;j<w;j++)
            {
                if((i&(1<<j))>0)
                {
                    sb.append(j);
                    sb.append(' ');
                }
            }
            sub2.add(sb.toString());
        }
        int cntr=0;
        for(String s1:sub1)
        {
            for(String s2:sub2)
            {
                int temp=b;
                boolean vis[][]=new boolean[h][w];
                String str1[]=s1.split(" ");
                String str2[]=s2.split(" ");
                for(int i=0;i<str1.length;i++)
                {
                    if(!str1[i].equals(""))
                    {
                        int r=Integer.parseInt(str1[i]);
                        for(int j=0;j<w;j++)
                        {
                            if(carr[r][j]=='#'&&!vis[r][j])
                            {
                                temp--;
                                vis[r][j]=true;
                            }
                        }
                    }
                }
                for(int i=0;i<str2.length;i++)
                {
                    if(!str2[i].equals(""))
                    {
                        int c=Integer.parseInt(str2[i]);
                        for(int j=0;j<h;j++)
                        {
                            if(carr[j][c]=='#'&&!vis[j][c])
                            {
                                temp--;
                                vis[j][c]=true;
                            }
                        }
                    }
                }
                if(temp==k)
                cntr++;
            }
        }
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}