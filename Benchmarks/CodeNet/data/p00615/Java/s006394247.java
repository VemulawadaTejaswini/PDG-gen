import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] array = new int[n + m + 1];
			array[0] = 0;
			for(int i = 1; i < array.length; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			//System.out.println(Arrays.toString(array));
			
			int max = 0;
			for(int i = 0; i < (array.length - 1); i++){
				max = Math.max(max, array[i+1] - array[i]);
			}
			
			System.out.println(max);
		}
		
	}

}