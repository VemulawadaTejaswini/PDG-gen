
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static void kMarsh(String[] grid) {
        int n=grid.length;
        int m=grid[0].length();
        char[][] mat=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=grid[i].charAt(j);
            }
        }
        int[][] first=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int ind=n;
                for(int k=j;k<n;k++)
                {
                    if(mat[k][i]=='x')
                    {
                        ind=k;
                        break;
                    }
                }
                first[i][j]=ind;
            }
        }
        boolean[][][] there=new boolean[n][m][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=j;k<m;k++)
                {
                    boolean b1=(mat[i][k]=='x')?false:true;
                    boolean b2=true;
                    if(k!=j)
                    b2=there[i][j][k-1];
                    if(!b1 || !b2)
                    there[i][j][k]=false;
                    else
                    there[i][j][k]=true;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]=='x')
                continue;
                int f1=first[j][i]-1;
                for(int k=j+1;k<m;k++)
                {
                    if(mat[i][k]=='x')
                    break;
                    int f2=first[k][i]-1;
                    int x=Math.min(f1,f2);
                    if(x==i)
                    continue;
                    if(!there[x][j][k])
                    continue;
                    int p=2*(x-i+k-j);
                    // System.out.println(i+" "+x+" "+k+" "+j+" "+p);
                    ans=Math.max(ans,p);
                }
            }
        }
        if(ans!=0)
        System.out.println(ans);
        else
        System.out.println("impossible");
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int b=0;
		int a=0;
		for(int i=0;i<3;i++)
		{
			a=a+(s.charAt(i)=='A'?1:0);
			b=b+(s.charAt(i)=='B'?1:0);
		}
		if(a==3 || b==3)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
