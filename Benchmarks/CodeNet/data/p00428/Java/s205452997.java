import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			if(n==0){break;}

			int[] vote = new int[m];
			Arrays.fill(vote, 0);
			for(int i=0; i<n; i++){
				String poll[] = br.readLine().split(" ");
				for(int j=0; j<m; j++){
					if (poll[j].equals("1")) {vote[j]++;}
				}
			}

			boolean resume = false;
			for(int i=n; i>=0; i--){
				for(int j=0; j<m; j++){
					if (vote[j] == i) {
						if(resume){System.out.print(" ");}
						System.out.print(j+1);
						resume = true;
					}
				}
			}
			System.out.println();
		}
	}
}