import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		int max = 0;
		int min = 10000;
		
		array = CountingSort(array, num, max,min,scanner);
		
		scanner.close();
	}

	public static int[] CountingSort(int[] array, int num, int max,  int min, Scanner scanner){ 
		int[] count = new int[10000];
		int[] sort = new int[num];
		int array_num = 0;
		
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
			count[ array[i] ] ++;
			
			if( array[i] > max ){
				max = array[i];
			}
			
			if( array[i] < min ){
				min = array[i];
			}
		}
			
		for(int i = min; i <= max; i ++ ){

			while( count[i] != 0 ){
				sort[array_num] = i;
				array_num ++;
				count[i] --;
				
				System.out.print(sort[array_num - 1]);
				if( i == max && count[i] == 0) {
				System.out.print("\n");
				}else {
					System.out.print(" ");
				}
			}
			
		}
		
		return sort;
	}
	
}
