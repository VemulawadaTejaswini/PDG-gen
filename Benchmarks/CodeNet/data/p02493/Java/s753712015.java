import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> list = new ArrayList<String>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while((st.hasMoreTokens())) {
			list.add(st.nextToken());
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			if(i != 0) System.out.print(" ");
		}
	}
	
}