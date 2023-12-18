import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lima = Integer.parseInt(in.readLine());
			String[] sa = in.readLine().split(" ");
			
			int limb = Integer.parseInt(in.readLine());
			String[] sb = in.readLine().split(" ");

			int[] a = new int[lima];
			int[] b = new int[limb];

			for (int i = 0; i < lima; i++) {
				a[i] = Integer.parseInt(sa[i]);
			}
			for (int i = 0; i < limb; i++) {
				b[i] = Integer.parseInt(sb[i]);
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			int j = 0;
			for (int i = 0; i < lima; i++) {
				System.out.print(a[i]);
				if (a[i] == b[j]) j++;
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