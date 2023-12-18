import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		
		shellSort(array, num);
		
		scanner.close();
	}

	public static int insertionSort( int[] array, int num, int g ,int count){ // N個の要素を含む0-オリジンの配列A
		int sub;
		int comp = 0;
		int i;
		
		for( i = 1; i <=  num - 1; i ++ ){
			sub = array[i];
			comp = i - g;
			while( -1 < j && sub < array[j] ){
				array[comp + g] = array[comp];
				j = j - g;
				count ++;
			}
			array[comp + 1] = sub;
			
		}
	}
	
	public static int[] shellSort(int[] array, inrt num){
		int cnt = 0;
		int m;
		int arrayG[100];
		for( int i = 0; i < 100; i ++ ){
			if( i == 0 ){
				arrayG[i] = num / 2 + 1;
			}else{
				arrayG[i] = arrayG[i-1] / 2 - 1;
			}
			
			if( arrayG[i] < 0 ){
				arrayG[i - 1] = 1;
				arrayG[i] = 0;
				m = i;
				
				break;
			}
			for( int i = 0; i < m; ++i ){
				insertionSort(A, n, arrayG[i], cnt);
			}
		}
		
		
		System.out.println(m);
		for(int cou = 0; cou < m; cou ++ ){
			System.out.print(array[cou]);
			if( cou == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println(cnt);
		for(int cou = 0; cou < num; cou ++ ){
			System.out.println(array[cou]);
		}
	}
	
}


