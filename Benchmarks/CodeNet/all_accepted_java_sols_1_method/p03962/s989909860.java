import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int a = Integer.parseInt(ss0[0]);
		int b = Integer.parseInt(ss0[1]);
		int c = Integer.parseInt(ss0[2]);

		int iCount = 0;
		
		if (a != b) { iCount = iCount + 1; }
		if (a != c) { iCount = iCount + 1; }
		if (b != c) { iCount = iCount + 1; }

		if (iCount == 0) { iCount = 1; }
		
		System.out.print(iCount);

    }
}

