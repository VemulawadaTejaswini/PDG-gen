import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] s = new int[n+1];
		String[] l = br.readLine().split(" ");
		for(int i = 0; i < n; ++i){
			s[i] = Integer.parseInt(l[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int cnt = 0;
		for(int i = 0; i < q; ++i) {
			s[n] = t[i];
			int j = 0;
			while(t[i] == s[j]) {
				j += 1;
			}
			if(j != n){
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

}