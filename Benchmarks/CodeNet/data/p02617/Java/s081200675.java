//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        ArrayList<Integer> edge[]=new ArrayList[N];
        for(i=0;i<N;i++) edge[i]=new ArrayList<>();

        for(i=0;i<N-1;i++)
        {
            String s[]=br.readLine().trim().split(" ");
            int u=Integer.parseInt(s[0])-1;
            int v=Integer.parseInt(s[1])-1;

            edge[Math.min(u,v)].add(Math.max(u,v));
        }

        long ans=0;
        for(i=0;i<N;i++) ans+=(long)(i+1)*(N-i);
        for(i=0;i<N;i++)
        {
            for(int v:edge[i])
                ans-=(long)(i+1)*(N-v);
        }
        System.out.println(ans);
    }
}