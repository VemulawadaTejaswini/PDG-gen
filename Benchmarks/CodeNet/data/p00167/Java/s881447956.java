import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = 5;
		int[] array = new int[num];
		int temp = 0;
		int replaceCount = 0;
		for(int i = 0; i < num; i ++) {
			array[i] = stdin.nextInt();
		}
		
		for(int j = 1; j < array.length; j++) {
			
			for(int k = 0; k < array.length - j; k++) {
				
				if(array[k] > array[k + 1]) {
					temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
					replaceCount++;
				}
				
			}
			
		}
		System.out.println(replaceCount);
	}

}