import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			input = scanner.nextInt();
			boolean[] check = new boolean[input];
			Arrays.fill(check, true);
			check[0] = false;
			for( int i=0; i<input; i++){
				if(check[i] == true){
					count++;
					for( int j=i; j<input; j+=i+1){
						check[j] = false;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}