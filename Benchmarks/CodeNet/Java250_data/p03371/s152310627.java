import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));


		int A = 0, B = 0, C = 0;
		long X = 0, Y = 0;
		String[] box = buff.readLine().split(" ");
		A = Integer.parseInt(box[0]);
		B = Integer.parseInt(box[1]);
		C = Integer.parseInt(box[2]);
		X = Long.parseLong(box[3]);
		Y = Long.parseLong(box[4]);
		long ans = 0;

		double pre_X = X, pre_Y = Y;
		long countAB = 0, countA = 0, countB = 0;
		/*while((pre_X > 0) || (pre_Y > 0)){
			if(pre_X >= 0.5 && pre_Y >= 0.5){
				long half = (A/2) + (B/2);
				if(half < C){
					ans += half;
				} else {
					ans += C;
				}
				pre_X -= 0.5;
				pre_Y -= 0.5;
				countAB++;
			} else if(pre_X >= 1){
				ans += A;
				pre_X--;
				countA++;
			} else if(pre_Y >= 1){
				ans += B;
				pre_Y--;
				countB++;
			}
		}*/
		if(X < Y){
			ans += X * 2 * C;
			ans += (Y - X) * B;
			//System.out.println("A1: " + (X * 2) + " " + (Y - X) + " " + ans);
		}else{
			ans += Y * 2 * C;
			ans += (X - Y) * A;
			//System.out.println("A2: " + (Y * 2) + " " + (X - Y) + " "  + ans);
		}
		long over = 0;
		if(X > Y){
			over = X * 2 * C;
			//System.out.println("B1: " + X * 2 + " " + over);
		} else {
			over = Y * 2 * C;
			//System.out.println("B2: " + Y * 2 + " " + over);
		}
		if(ans > over){
			ans = over;
		}

		long usu = X * A + Y * B;
		//System.out.println("C: " + X + " " + Y + " " + usu);
		if(ans > usu){
			ans = usu;
		}

		System.out.println(ans);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}