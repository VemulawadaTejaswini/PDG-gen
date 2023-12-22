import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//全体の個数を入力
		int n = sc.nextInt();
		// 入力値受け取りとリスト出力用
		int temp;
		//回数カウント用
		int count = 0;
		boolean result = true;
		//全体の個数を入力
		List<Integer> list = new ArrayList<>();
		//リストの入力
		for(int i = 0 ; i < n; i++){
			temp = sc.nextInt();
			list.add(temp);
		}
		for(int t = 0; t < n ; t++){
			if(result){
				temp = list.get(t);
				if(temp % 2 == 0){
					list.set(t,temp/2);
				}else{
					break;
				}
			}

			if(t == n - 1){
				//最初に戻す
				t = 0;
				count++;
			}
		}
		System.out.println(count);
	}
}
