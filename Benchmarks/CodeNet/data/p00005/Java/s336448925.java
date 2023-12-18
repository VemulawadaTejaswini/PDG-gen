import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????????????°?¨????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a, b, GCD, LCM;

		while ((str = br.readLine()) != null) {
			String[] num = str.split(" ", 0);
			//?????????
			a = Integer.parseInt(num[0]);
			b = Integer.parseInt(num[1]);
			//???????¨????
			GCD = euclid(a, b);
			LCM = a / GCD * b;
			System.out.println(GCD + " " + LCM);
		}
	}
	//??????????????????
	static int euclid(int u, int v) {
		int temp;
		if (u < v) {
			temp = u; u = v; v = temp;
		}
		if (v < 1) return -1;
		if (u % v == 0) return v;
		return euclid(v, u % v);
	}

}