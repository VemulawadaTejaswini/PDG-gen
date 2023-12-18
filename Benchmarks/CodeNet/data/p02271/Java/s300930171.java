import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] t = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(t[i]);
		}

		int q = Integer.parseInt(br.readLine());
		t = br.readLine().split(" ");
		int[] m = new int[n];
		for(int i = 0; i < q; ++i) {
			m[i] = Integer.parseInt(t[i]);
		}
		
		int sum;
		boolean[] flag = new boolean[q];
		for(int i = 1; i < Math.pow(2, n); ++i) {
			sum = 0;
			for(int j = 0; j < n; ++j) {
				if((i & (1 << j)) > 0){
					sum += a[j];
				}
			}
			for(int k = 0; k < q; ++k) {
				if(sum == m[k]) {
					flag[k] = true;
				}
			}
		}
		for(int k = 0; k < q; ++k) {
			if(flag[k]) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}