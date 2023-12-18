import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
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
		ArrayList<Object> ans = new ArrayList<Object>();
		
		while (true) {
			
			boolean nan_flag = true;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			for (; a <= b; a++) {
				if (isLeap(a)) {
					ans.add(a);
					nan_flag = false;
				}
			}
			if (nan_flag) ans.add("NAN");
			ans.add("");
			
		}
		
		for (int i = 0; i < ans.size() - 1; i++) {
			System.out.println(ans.get(i));
		}
		System.out.println();
	}

}