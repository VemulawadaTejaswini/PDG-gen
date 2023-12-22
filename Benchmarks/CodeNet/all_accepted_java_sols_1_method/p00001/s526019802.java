import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		int[] hight = new int[10];
		
		sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			hight[i] = sc.nextInt();
		}
		Arrays.sort(hight);
		
		for(int i = 9 ; i > 6; i--){
			System.out.println(hight[i]);
		}
	}
}