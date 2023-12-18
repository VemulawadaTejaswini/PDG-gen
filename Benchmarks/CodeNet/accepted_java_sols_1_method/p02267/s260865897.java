import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lima = Integer.parseInt(in.readLine());
			String[] sa = in.readLine().split(" ");
			
			int limb = Integer.parseInt(in.readLine());
			String[] sb = in.readLine().split(" ");

			int hit = 0;
			boolean[] flag = new boolean[limb];
			for (int i = 0; i < limb; i++) {
				flag[i] = false;
			}
			
			for (int i = 0; i < lima; i++) {
				for (int j = 0; j < limb; j++) {
					if (flag[j]) continue;
					
					if (sb[j].equals(sa[i])) {
						flag[j] = true;
						hit++;
						break;
					}
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