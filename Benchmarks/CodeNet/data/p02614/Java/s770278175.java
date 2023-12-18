import java.io.*;
class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),k=Integer.parseInt(s[2]),a[][]=new int[n][m],i,j,tot=0;
        for(i=0;i<n;i++)
        {
            String st=bu.readLine();
            for(j=0;j<m;j++)
            if(st.charAt(j)=='#') {a[i][j]=1; tot++;}
        }

        int all=(int)Math.pow(2,n+m);
        int ans=0;
        for(i=0;i<all;i++)
        {
            int ar[]=new int[32],p=0,x=i;
            while(x!=0)
            {
                if((x&1)==1) ar[p]++;
                p++;
                x>>=1;
            }
            int l,cn=0; boolean vis[][]=new boolean[n][m];
            for(j=0;j<n;j++)
            if(ar[j]==1)
            {
                for(l=0;l<m;l++)
                if(a[j][l]==1 && !vis[j][l])
                {
                    vis[j][l]=true;
                    cn++;
                }
            }
            for(j=0;j<m;j++)
            if(ar[j+n]==1)
            {
                for(l=0;l<n;l++)
                if(a[l][j]==1 && !vis[l][j])
                {
                    vis[l][j]=true;
                    cn++;
                }
            }
            //System.out.print(i+" "+cn+" ");
            if(tot-cn==k) ans++;
        }
        System.out.print(ans);
    }
}