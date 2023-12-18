import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//IDカード枚数
		int N = scanner.nextInt();
		//ゲートの個数
		int M = scanner.nextInt();
		List<Integer> listL = new ArrayList<Integer>();
		List<Integer> listR = new ArrayList<Integer>();
		
		int answer = 0;
		//リスト作成
		for(int i = 0; i < M; i++){
			
			listL.add(scanner.nextInt());
			listR.add(scanner.nextInt());
			
		}
		//全てのゲートを通れるカードの順番はlistLの最大値以上、listRの最小値以下
		Integer l = Collections.max(listL);
		Integer r = Collections.min(listR);
		if (l <= r){
			
			answer = r - l + 1;
		}else{
			
			answer = 0;
		}
		System.out.println(answer);
	}
}
