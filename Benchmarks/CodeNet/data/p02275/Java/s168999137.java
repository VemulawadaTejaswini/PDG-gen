import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		int max = 0;
		int min = 10000;
		
		array = CountingSort(array, num, max,min,scanner);
		
		output(array,num);
		
		scanner.close();
	}

	public static int[] CountingSort(int[] array, int num, int max,  int min, Scanner scanner){ 
		int[] count = new int[10000];
		int[] sort = new int[num*2];
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
			}
			
		}
		
		return sort;
	}
	
	public static void output( int[] array, int num ){
		
		for(int cou = 0; cou < num; cou ++ ){
			System.out.print(array[cou]);
			if( cou == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
	}
}
