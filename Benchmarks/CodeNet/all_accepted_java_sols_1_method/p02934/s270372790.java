import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String N = in.readLine();

		int x = Integer.parseInt(N);
		double sum = 0;
		N = in.readLine();
		String[] A = N.split(" ");
		for(int i=0;i<x;i++){
			sum += 1.0/Integer.parseInt(A[i]);
		}

		System.out.println(1/sum);

	}




}
