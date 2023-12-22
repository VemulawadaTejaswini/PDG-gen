import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];

		for(int i = 0; i < 5; i++){
			input[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		for(int i = 0; i < input.length; i++){
			for(int j = i + 1; j < input.length; j++){
				if(input[j] - input[i] > k){
					System.out.println(":(");
					return;
				}
			}
		}
		System.out.println("Yay!");
	}
}
