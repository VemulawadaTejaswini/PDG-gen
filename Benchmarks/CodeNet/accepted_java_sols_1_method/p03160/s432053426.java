import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int[] heights=new int[size];
		for(int i=0;i<size;i++)
		{
			heights[i]=(s.nextInt());
		}
        int[] dp=new int[heights.length];
  dp[0]=0;dp[1]=Math.abs(heights[1]-heights[0]);
  for(int i=2;i<heights.length;i++)
  {
    dp[i]=Math.min(dp[i-1]+Math.abs(heights[i]-heights[i-1]),
                   dp[i-2]+Math.abs(heights[i]-heights[i-2]));
  }
   int ans=dp[dp.length-1];
		System.out.println(ans);
		s.close();
	}
}
