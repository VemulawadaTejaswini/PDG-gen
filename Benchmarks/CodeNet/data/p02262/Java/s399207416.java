import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] A = new int[n];
			for(int i = 0; i<n ; i++)
			{
				A[i] = Integer.parseInt(br.readLine());
			}
			shellSort(A,n);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void shellSort(int[] arr , int l)
	{
		StringBuilder sb = new StringBuilder();
		int m = 1 ,cnt =0;
		int G[] = new int[13];
		G[0] = 1;
		while((G[m] = G[m-1] * 3 +1) <= l){
			m++;
		}
		sb.append(m).append('\n');
		m--;
		for(; m >= 0 ; m--){
			sb.append(G[m]);
			if(m!=0)
				sb.append(' ');
			cnt += insertionSort(arr,l,G[m]);
		}
		sb.append('\n').append(cnt).append('\n');
		
		for(m = 0 ; m < l ; m++){
			sb.append(arr[m]).append('\n');
		}
			System.out.print(sb);
	}
	public static int insertionSort(int[] a,int n , int g)
	{
		int cnt = 0;
		int v;
		for(int i = g ; i < n ; i++)
		{
			v = a[i];
			int j = i-g;
			while(j >= 0 && a[j] > v)
			{
				a[j+g] = a[j];
				a[j] = v;
				j -= g;
				cnt++;
			}
		}
		return cnt;
	}
}