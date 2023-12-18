import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static FastReader r=new FastReader();
    public static final int INF=1000000005;

    public static int []f;
    public static int find(int x){
        if(f[x]==x) return x;
        return f[x]=find(f[x]);
    }
    public static void main(String[] args) {
        int n=r.nextInt();
        int q=r.nextInt();
        f=new int[n];
        for(int i=0;i<n;++i){
            f[i]=i;
        }
        while(q-->0){
            int t=r.nextInt();
            int u=r.nextInt();
            int v=r.nextInt();
            if(t==0){
                int uu=find(u);
                int vv=find(v);
                f[vv]=uu;
            }
            else{
                int uu=find(u);
                int vv=find(v);
                if(uu==vv) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}
