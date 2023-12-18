import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 

		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		
		int rireki = 0;
		
		for(int i = N; i > 0; i--) {
			if(i == N) {
				rireki = K;
			}else {
				rireki = rireki * (K-1);
			}
		}

		System.out.print(rireki);
		keyboard.close();	
	}
}
