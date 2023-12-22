import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("\\s+");
		
		int[] arr = new int[n];
		long sum = 0;
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(s[i]);
			sum += arr[i];
		}
		sum = Math.round((double)sum/n);
		long res = 0;
		for(int i=0;i<n;i++)
		{
			res += (long)Math.pow((arr[i]-sum),2);
		}
		System.out.println(res);
	}
}
