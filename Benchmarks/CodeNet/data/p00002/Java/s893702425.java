
import java.util.*;
public class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum;
		int cnt = 1;
		int value;
		while(cnt < 200 || a > 0){
			sum = 0;
			value = 0;
			a = scan.nextInt();
			b = scan.nextInt();
			sum = a+b;
			while(sum < 0){
				sum = sum /10;
				value++; 
			}
			System.out.println(value);
			cnt++;
		}

	}

}