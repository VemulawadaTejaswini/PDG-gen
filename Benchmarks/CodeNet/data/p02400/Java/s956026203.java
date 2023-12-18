import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double r = Integer.parseInt(br.readLine());
			double p = 3.141592653589793;
			double x;	//面積
			double y;	//円周
			//計算
			x = p * r * r;
			y = 2 * p * r;
			System.out.println(x + " " + y);
	}
}