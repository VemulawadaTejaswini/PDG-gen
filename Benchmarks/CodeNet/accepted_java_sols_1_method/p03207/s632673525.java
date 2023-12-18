import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		int sum = 0;
		for(int i=0;i<n;i++){
			int thi = sc.nextInt();
			list.add(thi);
			sum += thi;
		}
		
		Collections.sort(list);

		sum -= list.get(n-1)/2;
		// System.out.println(list.get(n-1));
		System.out.println(sum);

	}
}