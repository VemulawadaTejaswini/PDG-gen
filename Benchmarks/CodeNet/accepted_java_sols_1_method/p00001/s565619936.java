import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] mt = new int[10];
		for(int i = 0; i < 10; i++){
			int h = scan.nextInt();
			mt[i] = h;
		}
		for(int i = 0; i < 10 - 1; i++){
			for(int j = 10 - 1; j > i; j--){
				if(mt[i] < mt[j]){
					int big = mt[j];
					mt[j] = mt[i];
					mt[i] = big;
				}
			}
		}
		for(int i = 0; i < 3; i++){
			System.out.printf("%d\n", mt[i]);
		}
	}
}