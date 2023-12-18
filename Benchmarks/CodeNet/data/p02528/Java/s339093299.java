import java.util.*;
public class Main{
	public static void main(String[] args){
		int[] array;
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < n - 1; i++){
			for (int j = 0; j < n - 1; j++){
				if (array[j] > array[j + 1]){
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
			if (i + 1 != n){
				System.out.print(array[i] + " ");
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
}