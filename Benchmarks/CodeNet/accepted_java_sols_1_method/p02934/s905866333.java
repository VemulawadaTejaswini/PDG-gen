import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n]; 
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		// 計算
        double d = 0;
		for(int i = 0; i < n; i++){
			d += (double)1/a[i];
		}
		// 出力
		System.out.println(1/d);
	}

}
