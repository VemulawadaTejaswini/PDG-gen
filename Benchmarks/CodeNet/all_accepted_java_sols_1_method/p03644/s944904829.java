import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //入力
		int targetNumber = sc.nextInt();  //ターゲットの数字
		int max_dividing = 0; //今までの中で一番割る回数が多かった回数
		int max_number = 1; //今までの中で一番割る回数が多かった数字


		for(int i = 1; i <= targetNumber; i++) { //一つ一つの数字について、まとめる。
			int ExTargetNumber = i;
			int manyOfdividing = 0; //それぞれの数字の割る回数を格納
			while(true) { //一つ一つの数字に対して、割る回数を計算し、暫定の最大割る回数の数字を格納
				if(ExTargetNumber % 2 == 0 && ExTargetNumber >0){
					ExTargetNumber = ExTargetNumber / 2;
					manyOfdividing++;
				}else {
					if(max_dividing < manyOfdividing) {
						max_dividing = manyOfdividing;
						max_number = i;
					}
					break;
				}
			}
		}
		System.out.println(max_number);
	}
}