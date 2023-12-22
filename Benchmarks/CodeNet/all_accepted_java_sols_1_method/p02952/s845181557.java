
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int numbers = 0;
		if(n <= 9) {
			numbers = n;
		}else if(n <= 99) {
			numbers = 9;	
		}else if(n <= 999) {
			numbers = n - 90;
		}else if(n <= 9999) {
			numbers = 909;
		}else if(n <= 99999){
			numbers = n - 9000 - 90; 
		}else {
			numbers = 90909;
		}
		System.out.println(numbers);
	}

}
