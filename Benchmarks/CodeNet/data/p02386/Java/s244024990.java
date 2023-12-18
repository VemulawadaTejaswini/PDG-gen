import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Dice4[] dice = new Dice4[N];
		for(int i = 0;i<N;i++)
		{
			dice[i] = new Dice4();
			String[] str = br.readLine().split(" ");
			for(int j=0;j<6;j++)
			{
				dice[i].setNum(j,Integer.parseInt(str[j]));
			}
		}
		
		boolean flag = true;
		
		for(int i=0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(dice[i].equals(dice[j]))
				{
					flag = false;
					break;
				}
			}
			if(!flag)break;
		}
		
		System.out.println(flag ? "Yes":"No");
		// TODO 自動生成されたメソッド・スタブ

	}
}
class Dice4 
{
	int[] num;
	public Dice4()
	{
		num = new int[6];
	}
	public boolean isSame(Dice4 d)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i] != d.num[i])return false;
		}
		
		return true;
	}
	@Override
	public boolean equals(Object o)
	{
		Dice4 D = (Dice4)o;
		for(int i=0;i<4;i++)
		{
			if(isSame(D))return true;
			rotateS();
			
			if(isSame(D))return true;
			
			for(int j=0;j<4;j++)
			{
				rotateE();
				if(isSame(D))return true;
			}
		}
		rotateE();
		
		for(int i=0;i<4;i++)
		{
			if(isSame(D))return true;
			rotateS();
			if(isSame(D))return true;
			for(int j=0;j<4;j++)
			{
				rotateE();
				if(isSame(D))return true;
			}
			
		}
		return false;
	}
	
	public void setNum(int index,int Num)
	{
		num[index] = Num;
	}
	
	public void rotateS()
	{
		int temp = num[0];
		num[0] = num[4];
		num[4] = num[5];
		num[5] = num[1];
		num[1] = temp;
	}
	
	public void rotateN()
	{
		int temp = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = num[4];
		num[4] = temp;
	}
	
	public void rotateW()
	{
		int temp = num[0];
		num[0] = num[2];
		num[2] = num[5];
		num[5] = num[3];
		num[3] = temp;
	}
	
	public void rotateE()
	{
		int temp = num[0];
		num[0] = num[3];
		num[3] = num[5];
		num[5] = num[2];
		num[2] = temp;
	}
}