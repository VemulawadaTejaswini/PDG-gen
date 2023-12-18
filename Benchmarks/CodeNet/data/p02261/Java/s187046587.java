import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		try{
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int n = Integer.parseInt(br.readLine());
			String[] str1 = br.readLine().split(" ");
			String[] str2 = Arrays.copyOf(str1,str1.length);
			bubbleSort(str1);
			selectionSort(str2);
			sb.append(appS(str1)).append("Stable\n")
			.append(appS(str2)).append(Arrays.equals(str1,str2) ? "Stable\n" : "Not Stable\n");
			System.out.print(sb.toString());
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void bubbleSort(String[] s)
	{
		boolean boo = true;
		for(int i = 0 ; boo ; i++)
		{
			boo = false;
			for(int j = s.length-1; j > i ; j--)
			{
				if(toInt(s[j]) < toInt(s[j-1]))
					swap(s,j,j-1);
					boo = true;
			}
		}
		
	}
	public static void selectionSort(String[] s)
	{
		int min;
		for(int i= 0 ; i< s.length-1; i++)
		{
			min = i;
			for(int j = i+1 ; j<s.length; j++)
			{
				if(toInt(s[j]) < toInt(s[min]))
				min = j;
			}
			if(min != i){
					swap(s,i,min);
			}
		}
	}
	public static int toInt(String s)
	{
		int ans;
		try{
			ans = (int)(s.charAt(1));
		}catch(NumberFormatException e){
			e.printStackTrace();
			//e.getMessage();
			return -1;
		}
		return ans;
		
	}
	public static void swap(String[] st,int z1,int z2)
	{
		String stemp = st[z2];
		st[z2] = st[z1];
		st[z1] = stemp;
	}
	public static String appS(String[] s)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(s[0]);
		for(int i = 1 ; i < s.length ; i++)
		{
			sb.append(" ").append(s[i]);
		}
		sb.append("\n");
		return sb.toString();
		
	} 
}