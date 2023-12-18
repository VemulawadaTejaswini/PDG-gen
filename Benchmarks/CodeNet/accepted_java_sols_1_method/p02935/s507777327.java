import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Double> aList = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			aList.add(sc.nextDouble());
		}
		
		//　昇順でソート
		Collections.sort(aList);

		//　前から順に合成
		double ans = aList.get(0);
		for(int i = 1; i < aList.size(); i++) {
			ans = (ans + aList.get(i)) / 2;
		}

		System.out.println(ans);
		sc.close();
	}
}
