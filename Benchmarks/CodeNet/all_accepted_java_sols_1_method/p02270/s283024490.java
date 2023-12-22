import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			String[] param = in.readLine().split(" ");
			int lim = Integer.parseInt(param[0]);
			int k = Integer.parseInt(param[1]);
			
			int max = 0;
			int sum = 0;
			int[] loads = new int[lim];
			for (int i = 0; i < lim; i++) {
				loads[i] = Integer.parseInt(in.readLine());
				sum = sum + loads[i];
				
				if (max < loads[i]) max = loads[i];
			}
			
			int start = (int)Math.ceil((double)sum / k);
			if (start < max) start = max;

			while (true) {
				int count = 0;
				
				int tmp = 0;
				for (int i = 0; i < loads.length; i++) {
					tmp = tmp + loads[i];
					
					if (tmp > start) {
						count++;
						tmp = loads[i];
					}
				}
				
				if (count < k) {
					System.out.println(start);
					break;
				}
				start++;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}