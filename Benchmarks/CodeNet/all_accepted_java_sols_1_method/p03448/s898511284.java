import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//500円の枚数入力
		int a = sc.nextInt();
		//100円の枚数入力
		int b = sc.nextInt();
		//50円の枚数入力
		int c = sc.nextInt();
		// 合計金額の入力
		int x = sc.nextInt();
		//出力用
		int count = 0;
		int sum = 0;
		for(int i = 0; i <= a; i++){
			for(int t = 0; t <= b; t++){
				for(int s = 0; s <= c; s++){
					sum = 500*i + 100*t + 50*s;
					if(sum == x){
						count++;
					}
				}
			}
		}
		// 出力
		System.out.println(count);
	}
}
