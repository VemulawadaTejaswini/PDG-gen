import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int [] w = new int[n];
		
		try {
			String str = br.readLine();
			String [] strs = str.split(" ");
			for(int i = 0; i < n; i++) {
				w[i] = Integer.parseInt(strs[i]);
			}
			br.close();
		} catch  (IOException e){
			e.printStackTrace();
		}
		
		int min = Math.abs(w[0] - Sum(1, n-1, w));
		
		for(int i = 1; i < n; i++) {
			int sum;
			if(min > (sum = Math.abs(Sum(0, i, w) - Sum(i+1, n-1, w)))) {
				min = sum;
			}
		}
		
		System.out.println(min);
	}
	
	static int Sum(int a, int n, int[] w){
		int sum = 0;
		for(int i = a; i <= n; i++) {
			sum += w[i];
		}
		return sum;
	}
}