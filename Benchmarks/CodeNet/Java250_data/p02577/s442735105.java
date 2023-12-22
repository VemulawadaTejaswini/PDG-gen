import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String number = input.next();

		long sum = 0;

		for (int i = 0; i < number.length(); i++){
			sum += Character.getNumericValue(number.charAt(i));
		}
		System.out.println(sum % 9 == 0 ? "Yes" : "No");
	}
}