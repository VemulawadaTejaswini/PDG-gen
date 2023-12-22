import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(char c : String.valueOf(n).toCharArray()){
			sum += Character.getNumericValue(c);
		}
		System.out.println(n % sum == 0 ? "Yes" : "No");
	}
}
