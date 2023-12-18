import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int n = Integer.parseInt(ss0[0]);
		int k = Integer.parseInt(ss0[1]);

		int f = 0;
		
		f = (k) * (int)Math.pow((k-1), (n-1));
		
		

		
		// System.out.print(n + " " + k + " " + f);
		System.out.print(f);

    }
}

