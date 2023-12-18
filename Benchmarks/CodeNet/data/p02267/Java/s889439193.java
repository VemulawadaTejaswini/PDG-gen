import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lima = Integer.parseInt(in.readLine());
			String[] a = in.readLine().split(" ");
			
			int limb = Integer.parseInt(in.readLine());
			String[] b = in.readLine().split(" ");
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			int j = 0;
			for (int i = 0; i < lima; i++) {
				if (b[j].equals(a[i])) j++;
				j++;
				if (j == limb) break;
			}
			
			System.out.println(j);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}