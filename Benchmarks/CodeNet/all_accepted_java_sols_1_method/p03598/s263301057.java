import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//sum創る
		int sum = 0;
		int c;
		int s;
		//N入力
		int n = sc.nextInt();
		//K入力
		int k = sc.nextInt();
		for(int i = 0; i <=  n -1; i++){
			int x = sc.nextInt();
			//AorB
			if(k / 2 < x){
				c = k - x;
				s = c * 2;
				sum = sum + s;
			}else{
			int y;
			y = x * 2;
			sum = sum + y;
			}
		}
		// 出力
		System.out.println(sum);
	}
}