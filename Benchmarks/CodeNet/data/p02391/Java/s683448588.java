
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		//int型の値を返す
		int a = scanner.nextInt();
		//int型の値を返す
		int b = scanner.nextInt();
		//入力された2つのint型の値の大小を比較してString型で返す(3, 4 => "a < b")
		String ans = compare(a, b);
		//返されたString型を出力をする
		System.out.println(ans);
	}
	/**
	 * 入力された2つのint型の値の大小を比較してString型で返す
	 * (a より b の方が大きければ => a < b)
	 * (a より b の方が小さければ => a > b)
	 * (a と b が等しければ => a == b)
	 * @param int a
	 * @param int b
	 * @return String ans
	 */
	public static String compare(int a, int b) {
		String ans = "";
		if(a < b){
			ans = "a < b";
		}else if(a > b){
			ans = "a > b";
		}else{
			ans = "a == b";
		}
		return ans;
	}
}

/**
 * 2つのint型の値を入力する
 * 入力された2つのint型の値の大小を比較してString型で返す(3, 4 => "a < b")
 * 返されたString型を出力をする
 */