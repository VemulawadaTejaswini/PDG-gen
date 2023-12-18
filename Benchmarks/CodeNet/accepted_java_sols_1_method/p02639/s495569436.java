import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		

		Scanner scanner = new Scanner(System.in);
		String[] ar = scanner.nextLine().split(" ");
		
		

		for(int i=0; i<ar.length; i++) {
			if (Integer.parseInt(ar[i]) == 0) {
				System.out.println(i+1);
			}
		}	}

	}