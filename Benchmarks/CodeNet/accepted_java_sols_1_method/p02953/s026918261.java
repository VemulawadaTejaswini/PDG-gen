import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] hs = br.readLine().split(" ");
		int[] he = new int[n];			
		for (int i = 0; i < n; i++) {
			he[i] = Integer.parseInt(hs[i]);
		}
		int max = he[0];
		boolean stop = false;
		for (int i = 0; i < n-1 && !stop; i++) {
			if(max < he[i]) {
				max=he[i];
			}
			if(he[i] <= he[i+1]) {
				if(max == he[i]) {
					max--;
				}
				he[i]--;
			} else {
				if(he[i] - 1 > he[i+1] || he[i] < max) {
					stop = true;
					System.out.println("No");
				} else {
					he[i]--;
					if(max == he[i]) {
						max--;
					}
				}
			}
			//System.out.println(Arrays.toString(he));
			//System.out.println(max);
		}
		if(!stop) System.out.println("Yes");
		//System.out.println(Arrays.toString(he));
		br.close();
	}

}
