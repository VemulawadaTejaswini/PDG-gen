
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];

		for(int i = 0; i < num; i++){
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < num/2;i++){
			int j = array[i];
			array[i] = array[num - 1 - i];
			array[num - 1 - i] = j;
		}
		for(int v = 0;v < num; v++){
			if(v != 0){
				System.out.print(" ");
			}

			System.out.print(array[v]);
		}
		System.out.println();
	}

}
