import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] s = str.split("[,. ]");
		

		for(String i:s) {

			if(i.length() >=3 && i.length() <=6) {
				System.out.print(" ");
				System.out.print(i);
			}
		}
//		System.out.print("\n");
		

	}
}

