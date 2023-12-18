import java.io.*;

public class Main{
	public static void main(String[] args)
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] ar = new int[n];
			for(int i=0 ; i < n ; i++)
			{
				ar[i] = Integer.parseInt(str[i]);
			}
			bubbleSort(ar,ar.length);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void bubbleSort(int[] a , int l)
	{
		boolean bool = true;
		int cou = 0;
		for(int i = l-1 ; bool ; i--  )
		{
			bool = false;
			for(int j = 0 ; j < i ; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					bool = true;
					cou++;
				}
			}
		}
		show(a,cou);		
	}
	public static void show(int[] b,int co){
		StringBuilder sb = new StringBuilder();
		for(int i= 0;i<b.length-1;i++)
		{
			sb.append(b[i]).append(" ");	
		}
		sb.append(b[b.length-1]).append("\n").append(co).append("\n");	
		System.out.print(sb);
	}
}