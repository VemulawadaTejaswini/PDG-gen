import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int index = 0;
		int min = 9999;
		for (int i = 0; i < 5; i++) {
			int don = sc.nextInt();
			array[i] = don;
			int firstDigit = don % 10;
			
			if (min > firstDigit && firstDigit != 0) {
				min = firstDigit;
				index = i;
			}
		}
		int ans = 0;
		
		for (int i = 0; i < 5; i++) {
			if(i != index) {
				if(array[i] % 10 != 0) {
					int temp = array[i] / 10;
					temp = temp +1;
					array[i] = temp * 10;
				
				}
				
				if(array[i] < 10) {
					array[i] = 10;
				}
			}
			ans += array[i];	
		}
		
		System.out.println(ans);

	}
}
