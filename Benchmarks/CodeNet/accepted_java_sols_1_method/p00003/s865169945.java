import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[3];
		
		for (int i = 0; i < N; i++) {
			array[0] = sc.nextInt();
			array[1] = sc.nextInt();
			array[2] = sc.nextInt();
			
			int temp;
			if (array[0] > array[1]) {
				temp     = array[0];
				array[0] = array[1];
				array[1] = temp;
			} 
			if (array[1] > array[2]) {
				temp     = array[1];
				array[1] = array[2];
				array[2] = temp;
			}
			
			if (array[2]*array[2] ==  array[1]*array[1] + array[0]*array[0]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}