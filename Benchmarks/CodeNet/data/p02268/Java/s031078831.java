import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int[] array1 = new int[num1+1];
		 //配列1個目
		for(int i = 0; i < num1; i++) {
			array1[i] = scan.nextInt();
		}
		//配列2個目
		int num2 = scan.nextInt();
		int[] array2 = new int[num2];
		for(int i = 0; i < num2; i++) {
			array2[i] = scan.nextInt();
		}
		
		int count = 0; //2つの配列の共通の個数
		
		for(int i = 0; i < num2; i++) {
		count += binarySearch(num1, array1, array2[i]);
		}
		
		System.out.println(count);
}
	
	public static int binarySearch(int n, int[] A, int key) {
		int left = 0;
		int right = n;
		int mid;
		while(left < right) {
			mid = (left + right) / 2;
			if(A[mid] == key) {
				return 1;
			} else if(key < A[mid]) {
					right = mid;
				} else {
					left = mid + 1;
			}
		}
		return 0;
	}
}
