
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		long[] arr=new long[n];
		long[] counter=new long[100001];
		long sum=0;
		String[] cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Long.valueOf(cmd[i]);
			sum+=arr[i];
			counter[(int)arr[i]]++;
		}
		int q=Integer.valueOf(br.readLine());
		for(int i=0;i<q;i++)
		{
			cmd=br.readLine().split(" ");
			long x=Long.valueOf(cmd[0]);
			long y=Long.valueOf(cmd[1]);
			long diff=y-x;
			sum=sum+diff*counter[(int)x];
			counter[(int)y]=counter[(int)x]+counter[(int)y];
			counter[(int)x]=0;
			System.out.println(sum);
		}
	}

}
