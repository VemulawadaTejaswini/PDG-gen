import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./ALDS1_4_D-in35.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[] t = br.readLine().split(" ");
		int n = Integer.parseInt(t[0]);
		int k = Integer.parseInt(t[1]); // max no of dump truck
		int[] w = new int[n];
		int left = 0;
		int right = 0;
		for(int i = 0; i < n; ++i) {
			w[i] = Integer.parseInt(br.readLine());
			right += w[i];
			if(left < w[i]){
				left = w[i];
			}
		}
		int mid = 0;
		while(left < right) {
			mid = (left + right)/2;
			int l = 1;// number of dump truck
			int s = mid;
			for(int i = 0; i < n && l <= k; ++i) {
				s -= w[i];
				if(s < 0){
					l += 1;
					s = mid - w[i];
				}
			}
			if(l <= k){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		System.out.println(right);

	}

}