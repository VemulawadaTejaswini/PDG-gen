
import java.io.*;
import java.util.*;
class Pair implements Comparable<Pair>
{
    int r;
    int c;
    int dist;
    public Pair(int r,int c,int d)
    {
        this.r=r;
        this.c=c;
        this.dist=d;
    }
    public int compareTo(Pair p)
    {
        if(this.dist>p.dist)
        return 1;
        else if(this.dist<p.dist)
        return -1;
        return 0;
    }
}
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
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int h=ar[0];
		int w=ar[1];
		int m=ar[2];
		int[][] arr=new int[m][2];
		HashMap<String,Integer> check=new HashMap<>();
		for(int i=0;i<m;i++)
		{
			ar=split();
			arr[i][0]=ar[0]-1;
			arr[i][1]=ar[1]-1;
			check.put(arr[i][0]+" "+arr[i][1],1);
		}
		int ans=0;
		int[]r=new int[h];
		int[]c=new int[w];
		int[][]r_h=new int[h][2];
		int[][]c_h=new int[w][2];
		for(int i=0;i<m;i++)
		{
			int row=arr[i][0];
			int col=arr[i][1];
			r[row]++;
			c[col]++;
			r_h[row][0]=r[row];
			r_h[row][1]=row;
			c_h[col][0]=c[col];
			c_h[col][1]=col;
		}
		Arrays.sort(r_h,new Comparator<int[]>() {
			public int compare(int[]a,int[]b)
			{
				return b[0]-a[0];
			}
		});
		Arrays.sort(c_h,new Comparator<int[]>() {
			public int compare(int[]a,int[]b)
			{
				return b[0]-a[0];
			}
		});
		for(int i=0;i<h;i++)
		{
			int cnt=r[i];
			int c1=c_h[0][1];
			int mx=c_h[0][0];
			cnt=cnt+mx;
			if(check.containsKey(i+" "+c1))
				cnt--;
			ans=Math.max(ans, cnt);
		}
		for(int i=0;i<w;i++)
		{
			int cnt=c[i];
			int r1=r_h[0][1];
			int mx=r_h[0][0];
			cnt=cnt+mx;
			if(check.containsKey(r1+" "+i))
				cnt--;
			ans=Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}
