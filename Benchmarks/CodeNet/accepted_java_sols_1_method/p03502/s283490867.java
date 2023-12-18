import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int sum = 0;
		for(int i=0;i<n.length();i++){
			sum += Character.getNumericValue(n.charAt(i));
		}
		if(Integer.parseInt(n) % sum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
