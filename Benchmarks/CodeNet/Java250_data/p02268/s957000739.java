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
			
			int hit = 0;
			boolean[] flag = new boolean[limb];
			for (int i = 0; i < limb; i++) {
				flag[i] = false;
			}
			
			for (int j = 0; j < limb; j++) {
				if (flag[j]) continue;

				int s = 0;
				int g = lima - 1;	
				int i = (s + g) / 2;
				while (s <= g) {
					if (b[j] > a[i]) {
						s = i + 1;
					} else if (b[j] == a[i]) {
						flag[j] = true;
						hit++;
						break;
					} else {
						g = i - 1;
					}
					i = (s + g) / 2;
				}
			}
			
			System.out.println(hit);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}