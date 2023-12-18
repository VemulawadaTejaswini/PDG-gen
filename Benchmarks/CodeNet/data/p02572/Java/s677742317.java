import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> list = new ArrayList<Long>();
		long res = 0;		
		int n = Integer.parseInt(bi.readLine());
		String st = bi.readLine();
		
		StringTokenizer str = new StringTokenizer(st, " ");
		
		for(int i = 0; i < n; i++) {
			
			long in = Long.parseLong(str.nextToken());
			
			for(int j = 0; j < list.size(); j++) {
				res = (res + (in * list.get(j)) % 1000000007) % 1000000007;
			}
			
			list.add(in);
			
		}
		
		System.out.println(res);		
		
	}

}