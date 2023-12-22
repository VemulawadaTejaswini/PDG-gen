import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] parts = br.readLine().split(" ");
		int N = Integer.parseInt(parts[0]);
		int M = Integer.parseInt(parts[1]);

		int[] ac = new int[N];
		int[] wa = new int[N];

		while (M > 0) {
	
			parts = br.readLine().split(" ");
			int index = Integer.parseInt(parts[0])-1;
			
			if(parts[1].equals("AC")) {
				if(ac[index]==0) {
			
					ac[index]++;
		
				}
			}else {
				if(ac[index]==0) {
		
					wa[index]++;
			
				}
			}

			M--;
		}
		
		for (int i = 0; i < N; i++) {
			if(ac[i]==0) {
				wa[i] = 0;
			}
		}
		int sumAc = 0;
		int sumWa = 0;
		
		for (int i = 0; i < N; i++) {
			sumWa+=wa[i];
		}
		
		for (int i = 0; i < N; i++) {
			sumAc += ac[i];
		}
		
		System.out.println(sumAc+" "+sumWa);

	}

}
