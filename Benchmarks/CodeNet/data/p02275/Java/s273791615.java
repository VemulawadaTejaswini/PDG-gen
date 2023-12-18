import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MAXK = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] c = new int[MAXK + 1];
		
		String[] l = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(l[i]);
			c[a[i]] += 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = MAXK; i >= 0; --i) {
			while(c[i] > 0){
				sb.insert(0, i + " ");
				c[i] -= 1;
			}
		}
		sb.deleteCharAt(sb.length() - 1);

		System.out.println(sb);
	}

}