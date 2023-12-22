import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();//
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i = 0; i < n; i++){
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		int sum = 0;
		for(int i = 0; i < n - 1; i++){
			sum = sum + list.get(i);
		}

		String result = "No";
		if(list.get(n - 1) < sum) result = "Yes";

		// 出力
		System.out.println(result);
	}

}


