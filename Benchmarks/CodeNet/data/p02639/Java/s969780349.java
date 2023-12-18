import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

	
		Scanner scanner = new Scanner(System.in);
		char [] ar = scanner.nextLine().toCharArray(); 
		
		for(int i=0; i<ar.length; i++) {
			if (ar[i] == '0') {
				System.out.println(i);
			}
		}

	}	}
