
import java.io.*;
import java.util.*;

public class Main {

	//ツ　2205 Problem B: ツ陛ウツつュツつカツチツェツッツカツー
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
		
			String s = reader.readLine();
			String[] sp = s.split(" ");
			int n = Integer.parseInt(sp[0]);
			int m = Integer.parseInt(sp[1]);
			if (n == 0)
				break;
			
			String[] atari = new String[n];
			int[] kin = new int[n];
			for(int i = 0; i < n; i++) {
				s = reader.readLine();
				sp = s.split(" ");
				String r = sp[0];
				kin[i] = Integer.parseInt(sp[1]);
				atari[i] = r.replace('*', '.');
			}

			int sum = 0;
			for(int i = 0; i < m; i++) {
				String ken = reader.readLine();
				for(int j = 0; j < n; j++) {
					if (ken.matches(atari[j])) {
						sum += kin[j];
					}
				}
			}
			
			System.out.printf("%d\n", sum);
		}		
		
		reader.close();
		
	}

}