import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] getStr = sc.next().split("");
		
		int j = 0;

		for (int i = 0; i < 3; i++) {
			
			if (getStr[i].equals(getStr[i+1])) {

				System.out.println("Bad");
				break;			

			} else {			
				
				j++;	
				
				if (j == 3) {

					System.out.println("Good");		

				}

			}

		}
	}
}