import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int  truck = scanner.nextInt();//要素数
		
		Allocation(num, truck, scanner);
		
		scanner.close();
	}

	public static void Allocation(int num, int truck, Scanner scanner){
		int sum = 0;
		int capacity;
		
		
		for(int i = 0; i < num; i ++ ){
			sum += scanner.nextInt();
		}
		
		if( truck != 1 ) {
			capacity = sum/truck + 1;
		}else {
			capacity = sum/truck;
		}
		
		System.out.println(capacity);
		
	}
}
