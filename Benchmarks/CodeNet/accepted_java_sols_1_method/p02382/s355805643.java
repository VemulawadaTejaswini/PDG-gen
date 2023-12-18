import java.util.Scanner;
import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];

		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			y[i] = sc.nextInt();
		}
		//マンハッタン距離
		{
			double manhattan = 0;
			for(int i = 0; i < n; i++){
				manhattan += abs(x[i] - y[i]);
			}
			System.out.println(manhattan);
		}
		//ユークリッド距離と3乗.ver
		{
			double yukurid = 0;
			double sum = 0;
			for(int i = 0; i < n; i++){
				sum += pow(abs(x[i] - y[i]), 2);
			}
			yukurid = sqrt(sum);
			System.out.println(yukurid);
			sum = 0;
			for(int i = 0; i < n; i++){
				sum += pow(abs(x[i] - y[i]), 3);
			}
			double p3ver = cbrt(sum);
			System.out.println(p3ver);
		}
		//チェビシェフ距離
		{
			double chebi = 0;
			double max = 0;
			for(int i = 0; i < n; i++){
				max = max(max, abs(x[i] - y[i]));
			}
			System.out.println(max);
		}
	}
}

