import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		double[] v = new double[n]; 
		for(int i = 0; i < n; i++){
			v[i] = sc.nextDouble();
		}

		// 計算
		Arrays.sort(v);
		double result = v[0];
		for(int i = 1; i < n; i++){
			result = (result + v[i])/2;
		}
		// 出力
		System.out.println(result);
	}

}
