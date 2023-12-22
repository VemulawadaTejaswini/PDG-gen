import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String trimed = input.replace(input.substring(0, 1), "");
		if(trimed.length()==2){
			if(trimed.charAt(0) == trimed.charAt(1)){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}