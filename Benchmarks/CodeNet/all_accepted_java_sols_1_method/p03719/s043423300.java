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
		long a = Long.parseLong(ss0[0]);
		long b = Long.parseLong(ss0[1]);
		long c = Long.parseLong(ss0[2]);


		if((a<=c)&&(c<=b)) { System.out.println("Yes"); return; }

        System.out.println("No");
        return;
    }


}