import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		
		int h = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		br.close();
		List<Long> mons = new ArrayList<Long>();
		for(String s:line) {
			mons.add(Long.parseLong(s));
		}
		
		Collections.sort(mons,Collections.reverseOrder());
		
		long count = 0;
		for(int i=0;i<mons.size();i++) {
			if(i<k) continue;
			count += mons.get(i);
		}
		System.out.println(count);
		
	}
}
