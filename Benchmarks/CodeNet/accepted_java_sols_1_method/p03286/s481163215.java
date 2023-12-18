import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n==0)
		{
			System.out.println(0);
			return;
		}
		int[] num = null;
		int digs = 0;
		boolean neg = false;
		if(n<0)
		{
			n *= -1;
			neg = true;
		}
		{
			String s = Long.toBinaryString(n);
			digs = s.length();
			num = new int[digs+3];
//			System.out.println(s);
			for(int i = 0; i < digs; i++)
			{
				if(s.charAt(digs - 1 - i) == '1')
				{
					num[i]++;
					if(i%2==1 ^ neg)
					{
						num[i+1]++;
					}
				}
				while(num[i] >= 2)
				{
					if(num[i+1] > 0)
					{ //collide
						num[i+1]--;
						num[i] -= 2;
					}
					else
					{
						num[i+1]++;
						num[i+2]++;
						num[i]-= 2;
					}
				}
			}
//			System.out.println(Arrays.toString(num));
		}

		
		StringBuilder sb = new StringBuilder();
		boolean go = false;
		for(int i = digs+2; i>=0; i--)
		{
			if(num[i] == 1)go = true;
			if(go)sb.append(num[i]);
		}
		System.out.println(sb);
	}

}
