import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());
			
			int[] a = new int[lim];
			for (int i = 0; i < lim; i++) {
				a[i] = Integer.parseInt(in.readLine());
			}

			int max = -1000000000;
			int mini = a[0];
			for (int i = 0; i < lim; i++) {
				if (mini < a[i]) continue;
				else mini = a[i];
				for (int j = (i + 1); j < lim; j++) {
					int tmp = a[j] - a[i];
					if (max < tmp) max = tmp;
				}
			}
			System.out.println(max);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}