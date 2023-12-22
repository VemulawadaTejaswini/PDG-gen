import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[w];
		int swap1, swap2;
		byte garbage;

		for(int i = 0;i < w;i++) array[i] = i + 1;

		for(int i = 0;i < n;i++){
//			String swap = sc.next();
			String[] swaps = sc.next().split(",", 0);

			swap1 = Integer.parseInt(swaps[0]) - 1;
			swap2 = Integer.parseInt(swaps[1]) - 1;

			int temp = array[swap1];
			array[swap1] = array[swap2];
			array[swap2] = temp;
		}

		for(int i = 0;i < w;i++){
			System.out.println(array[i]);
		}

	}
}
