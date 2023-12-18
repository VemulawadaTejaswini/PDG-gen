import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String N = in.readLine();

		int x = Integer.parseInt(N);
		double sum = 0;
		N = in.readLine();
		String[] X = N.split(" ");
		int[] V = new int[x];
		for(int i=0;i<x;i++){
			V[i] = Integer.parseInt(X[i]);
		}

		Arrays.sort(V);
		double ans = (V[0]+V[1])/2.0;
		for(int i=2;i<V.length;i++){
			ans = (ans+V[i])/2.0;
		}
		System.out.println(ans);

	}




}
