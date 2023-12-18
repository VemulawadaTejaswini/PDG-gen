import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int  truck = scanner.nextInt();//トラック数
		
		Allocation(num, truck, scanner);
		
		scanner.close();
	}

	public static void Allocation(int num, int truck, Scanner scanner){
		int[] array = new int[num];
		int sum = 0;
		int ave;
		int capacity = 0;
		int sub = 0;
		long max = 0;
		
		//要素を作りながら足す
		for (int i = 0; i < num; i ++) {
			array[i] = scanner.nextInt();
			sub += array[i];
			max = Math.max(max,array[i]);
		}
		
		//2分探索準備
		long left = max;
		long rigft = sub;
		
		
		//探索
		while (left < right) {
			long p = (left+right)/2;
			int id = 0;
			long sum = 0;
			for (int i = 0; i < num; i ++) {
				if (sum + array[i] > p) {
					sum = array[i];
					id ++;
				}else {
					sum += array[i];
				}
				if (id == truck){
					break;
				}
			}
			if (id == truck){
				left = p + 1;
			}else{
				right = p;
			}
		}
		//出力
		System.out.println(left);
		
	}
}
