import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		for (char c : str.toCharArray()) {
			if ('A' <= c && c <= 'Z') c = Character.toLowerCase(c);
			else if ('a' <= c && c <= 'z') c = Character.toUpperCase(c);
			
			System.out.print(c);
		}
		System.out.println();
	}
}