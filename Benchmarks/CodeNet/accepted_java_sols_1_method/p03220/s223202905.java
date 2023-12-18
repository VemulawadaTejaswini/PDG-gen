import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		double t = sc.nextInt();
		double a = sc.nextInt();
		// List<Integer> list = new ArrayList<>();
		double minDiffT = 100000;
		int minI = 0;

		for(int i=0;i<n;i++){
			double currentH = sc.nextInt();
			// list.add(sc.nextInt());
			double currentDiff = Math.abs(t - currentH * 0.006-a);
			
			if(currentDiff<minDiffT){
				minDiffT  = currentDiff;
				minI = i+1;
			}
			
		}
			
		System.out.println(minI);

	}
}