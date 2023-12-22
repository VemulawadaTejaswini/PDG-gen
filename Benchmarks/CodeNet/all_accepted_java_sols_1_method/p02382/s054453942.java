import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double mksOne = 0;
		double mksTwo = 0;
		double mksThree = 0;
		double mksMax = 0;
		String[] strX = br.readLine().split(" ");
		String[] strY = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			mksOne += Math.abs(Integer.parseInt(strX[i]) - Integer.parseInt(strY[i]));
			mksTwo += Math.pow(Math.abs(Integer.parseInt(strX[i]) - Integer.parseInt(strY[i])), 2);
			mksThree += Math.pow(Math.abs(Integer.parseInt(strX[i]) - Integer.parseInt(strY[i])), 3);
			if (mksMax < Math.abs(Integer.parseInt(strX[i]) - Integer.parseInt(strY[i]))) {
				mksMax = Math.abs(Integer.parseInt(strX[i]) - Integer.parseInt(strY[i]));
			}
		}
		System.out.println(mksOne);
		System.out.println(Math.sqrt(mksTwo));
		System.out.println(Math.cbrt(mksThree));
		System.out.println(mksMax);
	}
}