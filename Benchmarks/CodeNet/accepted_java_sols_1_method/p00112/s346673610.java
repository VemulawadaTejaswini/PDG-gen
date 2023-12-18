import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while(!(str=br.readLine()).equals("0")){
			int n = Integer.parseInt(str);
			long min[] = new long[n];
			long allMin[] = new long[n+1];
			long res=0;

			for(int i=0; i<n; i++){
				min[i] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(min);

			for(int i=0; i<n; i++){
				allMin[i+1] += allMin[i] + min[i];
			}

			for(int i=0; i<n; i++){
				res += allMin[i];
			}

			System.out.println(res);

		}

	}
}