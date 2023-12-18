import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		
		insertionSort(array, num);
		
		scanner.close();
	}

	public static int[] insertionSort( int[] array, int num){ // N個の要素を含む0-オリジンの配列A
		int sub;
		int comp = 0;
		int i;
		
		for(int cou = 0; cou < num; cou ++ ){
			System.out.print(array[cou]);
			if( cou == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
		
		for( i = 1; i <=  num - 1; i ++ ){
			sub = array[i];
			comp = i - 1;
			while( comp >= 0 && array[comp] > sub ){
				array[comp + 1] = array[comp];
				comp --;
			}
			array[comp + 1] = sub;
			
			for(int cou = 0; cou < num; cou ++ ){
				System.out.print(array[cou]);
				if( cou == num - 1) {
				System.out.print("\n");
				}else {
					System.out.print(" ");
				}
			}
		}
		return array;
	}
}
