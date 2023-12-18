import java.io.*;

public class Main{
	public static void main(String[] args)
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String[] str =  br.readLine().split(" ") ;
			int[] ar = new int[n];
			for(int i= 0; i<n; i++)
			{
				ar[i] = Integer.parseInt(str[i]);
			}
			araiSort(ar,ar.length);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void araiSort(int[] a ,int len)
	{
		int min,temp,cou=0;
		for(int i = 0; i < len-1; i++)
		{
			min = i ;
			for(int j = i+1; j<len ; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
				cou++;
			}
		}
		show(a,cou);
		
		
	}
	public static void show(int[] b,int co)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < b.length ; i++ ){
			sb.append(b[i]).append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("\n").append(co);
		System.out.println(sb.toString());
	}
}