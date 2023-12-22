import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String s = bw.readLine();
		String[] w = s.split("\\s+");
		int S = Integer.parseInt(w[0]);
		int W = Integer.parseInt(w[1]);
		
		if (W >= S) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}
		bw.close();
	}
	
	
}	

