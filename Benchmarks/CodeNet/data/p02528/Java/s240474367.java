import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array;
		array = new int[n];
		int i, j, t;
		for (i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		for (i = n - 1; i > 0; i--){
			for (j = 0; j < i; j++){
				if(array[j] > array[j + 1]){
					t = array[j + 1];
					array[j + 1] = array[j];
					array[j] = t;
				}
			}
		}
		for (i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}
	}
}