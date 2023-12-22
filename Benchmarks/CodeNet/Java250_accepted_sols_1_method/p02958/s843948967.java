import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean flg = true;

		// 整数の入力
		int n = sc.nextInt();

		int array[] = new int[n];

		int flg2 = -1;
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			//array[i] = sc.nextInt();
			
			if(flg2 != -1 && array[i-1] > array[i]) {
				int tmp = array[flg2];
				array[flg2] = array[i];
				array[i] = tmp;
				
				flg2 = -1;
				break;
			}
			
			if(i > 0 && flg2 == -1 && array[i-1] > array[i]) {
				flg2 = i-1;
			}
		}
		
		if(flg2 != -1) {
			int tmp = array[flg2+1];
			array[flg2+1] = array[flg2];
			array[flg2] = tmp;
		}
		
		for(int i = 0; i < n-1; i++) {
			if(array[i] > array[i+1]) {
				flg = false;
				break;
			}
		}

		if(flg) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

        sc.close();
	}
}