import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int q = Integer.parseInt(br.readLine());
		int[] m = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
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