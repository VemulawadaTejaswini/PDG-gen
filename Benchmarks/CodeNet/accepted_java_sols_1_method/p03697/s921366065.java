import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int A = Integer.parseInt(ss0[0]);
		int B = Integer.parseInt(ss0[1]);
		
		int ans = A+B;
		
		if (ans >= 10) {
			System.out.println("error");
		} else {
			System.out.println(ans);
		}

		
	return;
	}


}
