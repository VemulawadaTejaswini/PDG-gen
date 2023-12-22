import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			if(!numList.contains(value)){
				numList.add(value);
			}
		}

		// 出力
		System.out.println(numList.size());
	}
}


