import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		//int型の値を返す
		int a = scanner.nextInt();
		//int型の値を返す
		int b = scanner.nextInt();
		//int型の値を返す
		int c = scanner.nextInt();
		//入力された3つのint型が「a<b<c」になるか否かを判定する
		String ans = extent(a, b, c);
		System.out.println(ans);
	}
	
	/**
	 * 入力された3つのint型が「a<b<c」になるか否かを判定する
	 * @param int a
	 * @param int b
	 * @param int c
	 * @return ans
	 */
	public static String extent(int a, int b, int c) {
		String ans = "No";
		if(a < b && b < c){
			ans = "Yes";
		}
		return ans;
	}
	
}

/**
 * 3つのint型のa,b,c値を入力する
 * 入力された3つのint型が「a<b<c」になるか否かを判定する
 * (「a<b<c」だとしたら"Yes")
 * (「a<b<c」じゃなかったら"No")
 * 返されたString型を出力をする
 */