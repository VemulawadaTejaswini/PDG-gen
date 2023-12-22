import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String line = sc.nextLine();
			String answer ="";

			for(int i=0;i<line.length();i++){
				char ch = line.charAt(i);
				if(Character.isLowerCase(ch)) answer = answer + Character.toUpperCase(ch);
				else answer = answer + Character.toLowerCase(ch);
			}
			System.out.println(answer);
		}
	}
}
