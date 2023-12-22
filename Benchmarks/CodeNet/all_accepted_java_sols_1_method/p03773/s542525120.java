//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int a = Integer.parseInt(ss0[0]);
		int b = Integer.parseInt(ss0[1]);

		a += b;
		if (a >= 24) { a -= 24; }

        System.out.println(a);
        return;
    }

}

//-----------------------------------------------------------
//-----------------------------------------------------------

