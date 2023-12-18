import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=Integer.parseInt(str);
		str=br.readLine();
		String[] strAry =str.split(" ");
		int min=10000000;
		int max=-10000000;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int tmp=Integer.parseInt(strAry[i]);
			if(min>tmp)min=tmp;
			else if(max<tmp)max=tmp;
			sum+=tmp;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}