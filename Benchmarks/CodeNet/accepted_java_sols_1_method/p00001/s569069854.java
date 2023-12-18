import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Integer[] height = new Integer[] {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<10;i++) {
			height[i] = sc.nextInt();
		}
	
		Arrays.sort(height, Collections.reverseOrder());
		
		for(int i=0; i<3; i++) {
			System.out.println(height[i]);
		}
		
	}
}
