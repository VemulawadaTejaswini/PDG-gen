import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int  truck = scanner.nextInt();//トラック数
		
		Allocation(num, truck, scanner);
		
		scanner.close();
	}

	public static void Allocation(int num, int truck, Scanner scanner){
		int sum = 0;
		int ave;
		int capacity = 0;
		int sub = 0;
		int[] array = new int[num];
		
		//要素を全部足す
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		
		if( truck != 1 ) {
			ave = sum / truck + 1;
		}else {
			ave = sum / truck;
		}
		
		for(int i = 0; i < num; i ++ ){
			sub += array[i];
			if( sub > ave ){
				sub = array[i];
				capacity ++;
			}
		}
		capacity = ave + ( capacity - truck + 1 );

		//System.out.println(ave);
		System.out.println(capacity);
		
	}
}
