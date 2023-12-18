import java.io.*;
import java.util.*;
public class Main {
	
	public static boolean isLeap(int year) {
		
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else 
			return year % 4 == 0;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			boolean nan_flag = true;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			for (; a <= b; a++) {
				if (isLeap(a)) {
					ans.add(String.valueOf(a));
					nan_flag = false;
				}
			}
			if (nan_flag) ans.add("NA");
			ans.add("");
			
		}
		
		for (int i = 0; i < ans.size() - 1; i++) {
			if (ans.get(i).equals("")) {
				System.out.println();
				continue;
			}
			System.out.println(ans.get(i));
		}
	}

}