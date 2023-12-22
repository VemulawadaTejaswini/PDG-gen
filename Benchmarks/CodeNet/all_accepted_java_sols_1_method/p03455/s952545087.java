import java.util.*;

public class Main {
	public static void main(String[] args){
		//入力値を受け取る
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		//受け取った値をかけ合わせ2で割った余りを出す
		int result = input1 * input2 % 2;
		//余りが0 OR 1で出力を切り分け
		if(result == 0){
			//偶数のとき
			System.out.println("Even");
		}else{
			//奇数のとき
			System.out.println("Odd");
		}
	}
}