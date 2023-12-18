import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AOJ_1126
{
	int W;
	int H;
	String[] C;
	int[][] table;
	List<String> ansList;
	private boolean isNum(char ch)
	{
		if(ch >= '0' && ch <= '9')return true;
		return false;
	}
	private boolean isStrNum(String s)
	{
		if(s.charAt(0) == '0')return false;
		return true;
	}
	private int strNumComp(char[] charA,char[] charB)
	{
		if(charA.length > charB.length)return 1;
		if(charA.length < charB.length)return -1;
		
		for(int i = 0;i < charA.length;i++)
		{
			if(charA[i] == charB[i])continue;
			if(charA[i] > charB[i])return 1;
			if(charA[i] < charB[i])return -1;
		}
		
		return 0;
	}
	private int strNumComp(String a,String b)
	{
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		
		if(charA.length > charB.length)return 1;
		if(charA.length < charB.length)return -1;
		
		for(int i = 0;i < charA.length;i++)
		{
			if(charA[i] == charB[i])continue;
			if(charA[i] > charB[i])return 1;
			if(charA[i] < charB[i])return -1;
		}
		
		return 0;
	}
	private void dfs(int h,int w,String S)
	{
		/*if((table[h][w] == 0 || (h >= H - 1  && w >= W - 1))&& !S.isEmpty())
		{
			System.out.println("aaa");
			ansList.add(S);
			return;
		}*/
		
		if(h + 1 < H && table[h + 1][w] > 0)
		{
			dfs(h + 1,w,S + C[h + 1].charAt(w));
		}
		
		if(w + 1 < W && table[h][w + 1] > 0)
		{
			dfs(h, w + 1,S + C[h].charAt(w + 1));
		}
		
		if(h + 1 < H && w + 1 < W && table[h + 1][w + 1] > 0)
		{
			dfs(h + 1,w + 1,S + C[h + 1].charAt(w + 1));
		}
		//System.out.println(S);
		ansList.add(S);
		return;
	}
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			W = cin.nextInt();
			H = cin.nextInt();
			if(W == 0 && H == 0)break;
			C = new String[H];
			for(int i = 0;i < H;i++)
			{
				C[i] = cin.next();
			}
			table = new int[H][W];
			for(int i = 0;i < H;i++)
			{
				for(int j = 0;j < W;j++)
				{
					if(C[i].charAt(j) >= '0' && C[i].charAt(j) <= '9')table[i][j] = 1;
				}
			}
			int[] bin = new int[500];
			for(int i = 0;i < H;i++)
			{
				for(int j = 0;j < W;j++)
				{
					char ch = C[i].charAt(j);
					if(isNum(ch))
					{
						if(j + 1 < W && isNum(C[i].charAt(j + 1)))
						{
							table[i][j + 1] = Math.max(table[i][j] + 1,table[i][j + 1]);
						}
						if(i + 1 < H && isNum(C[i + 1].charAt(j)))
						{
							table[i + 1][j] = Math.max(table[i][j] + 1,table[i + 1][j]);
						}
						
						if(i + 1 < H && j + 1 < W && isNum(C[i + 1].charAt(j + 1)))
						{
							table[i + 1][j + 1] = Math.max(table[i][j] + 1,table[i + 1][j + 1]);
						}
					}
				}
			}
			
			ansList = new ArrayList<String>();
			for(int i = 0;i < H;i++)
			{
				for(int j = 0;j < W;j++)
				{
					if(table[i][j] == 0)continue;
					if(isNum(C[i].charAt(j)))
					{
						dfs(i,j,C[i].charAt(j) + "");
					}
				}
			}
			//System.out.println(ansList.size());
			String ans = "";
			for(String s : ansList)
			{
				if(!isStrNum(s))continue;
				if(ans == "")
				{
					ans = s;
					continue;
				}
				if(strNumComp(ans,s) == -1)
				{
					ans = s;
				}
				//System.out.println(s);
			}
			System.out.println(ans);
			/*for(int i = 0;i < H;i++)
			{
				for(int j = 0;j < W;j++)
				{
					System.out.print(table[i][j] + " ");
				}
				System.out.println();
			}*/
		}
	}
	public static void main(String[] args)
	{
		new AOJ_1126().solve();
	}
}