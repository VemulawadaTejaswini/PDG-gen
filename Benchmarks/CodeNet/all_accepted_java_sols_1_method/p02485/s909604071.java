import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			String str = sc.next();
			if (str.charAt(0) == '0' && str.length() == 1) break;
			int sum = 0;
			for (int i = 0; i < str.length(); i++){
			sum += str.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}