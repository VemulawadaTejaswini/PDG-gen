import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
			}
			
			Arrays.sort(loads);
			int start = (int)Math.ceil((double)sum / k);
			if (start < max) start = max;
			
			boolean[] loaded = new boolean[loads.length];
			boolean end = false;
			
			while (end == false) {
				end = true;

				for (int j = 0; j < loaded.length; j++) {
					loaded[j] = false;
				}
				
				for (int j = 0; j < k; j++) {
					int cap = start;
					for (int i = loads.length; i > 0; i--) {
						if (loaded[i - 1]) continue;
						
						if (cap >= loads[i - 1]) {
							cap = cap - loads[i - 1];
							loaded[i - 1] = true;
						}
					}
				}
				
				for (int j = 0; j < loaded.length; j++) {
					if (loaded[j] == false) {
						end = false;
						break;
					}
				}
				if (end) System.out.println(start);
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