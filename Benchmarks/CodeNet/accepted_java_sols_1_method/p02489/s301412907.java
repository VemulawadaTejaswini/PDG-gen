import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] a) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			
			int num = Integer.parseInt(br.readLine());
			if (num == 0) break;
			list.add(num);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}
	}
	
}