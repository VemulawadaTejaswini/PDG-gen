import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);
			if(n==0){break;}

			int maxi = 0;
			int sum = 0;
			int[] seq = new int[n];
			for(int i=0; i<n; i++){
				seq[i] = Integer.parseInt(br.readLine());
			}

			for(int i=0; i<k; i++){
				sum += seq[i];
			}
			maxi = sum;
			for(int i=k; i<n; i++){
				sum -= seq[i-k];
				sum += seq[i];
				maxi = Math.max(maxi, sum);
			}

			System.out.println(maxi);
		}
	}
}