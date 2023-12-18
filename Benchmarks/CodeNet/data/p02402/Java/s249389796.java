import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		int[] ary=new int[n];
		int i=0;

		StringTokenizer st=new StringTokenizer(br.readLine());

		while(i<n) {
			int a=Integer.parseInt(st.nextToken());
			ary[i]=a;
			i++;
		}

		int max=ary[0];
		int min=ary[0];
		int sum=0;

		for(i=0;i<ary.length;i++) {
			max=Math.max(max,ary[i]);
			min=Math.min(min,ary[i]);
			sum=sum+ary[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}

}

