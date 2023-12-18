import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[10];
		
		for(int i = 0; i < 10; i++){
			t[i] = sc.nextInt();
		}
		
		Arrays.sort(t);
		
		for(int i = 9; i >= 7; i--){
			System.out.println(t[i]);
		}
	}
}