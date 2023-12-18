import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N;
		while ((N = Integer.parseInt(br.readLine())) > 0) {
			HashMap<Integer, Integer> lhm = new LinkedHashMap<>();
			
			for (int i = 0; i < N; i++) {
				String[] lc = br.readLine().split(" ");
				int a = Integer.parseInt(lc[0]);
				int b = Integer.parseInt(lc[1]);
				int c = Integer.parseInt(lc[2]);

				Integer cur = lhm.get(a);
				if(cur != null) {
					lhm.replace(a, cur + b*c);
				}
				else
				{
					lhm.put(a, b*c);
				}
			}
			
			boolean zzz = false;
			for (Integer key : lhm.keySet()){
				Integer cur = lhm.get(key);
				if(cur >= 1000000){
					System.out.println(key);
					zzz = true;
				}
			}
			
			if(!zzz)
				System.out.println("NA");
		}

	}
}