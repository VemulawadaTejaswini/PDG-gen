import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[2];
		while(true) {
			// 入力を受け付ける
			for(int i=0; i<arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			// 判断
			if(arr[0] == 0 && arr[1] == 0) break;
			// 入れ替えアルゴリズム
			if(arr[0] > arr[1]) {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
			}
			// 出力
			System.out.println(arr[0]+" "+arr[1]);
		}
	}
}