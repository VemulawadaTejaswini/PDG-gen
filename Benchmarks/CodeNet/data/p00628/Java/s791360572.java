import java.util.Scanner;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();		
		while(str != "END OF INPUT") {
			String[] s = str.split(" ");
			for(String i:s) {
				System.out.print(i.length());
			}
			System.out.print("\n");
			
			str = sc.nextLine();
		
		}
	}
}

