import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		int[] height = new int[10];
		
		sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			height[i] = sc.nextInt();
		}
		Arrays.sort(height);
		
		for(int i = 9 ; i > 6; i--){
			System.out.println(height[i]);
		}
	}
}