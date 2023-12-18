
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		char[] ch = scan.nextLine().toCharArray();

		for(int i = ch.length-1;i >=0 ;i--) {
			System.out.print(ch[i]);
		}

		System.out.println();

		scan.close();

	}

}
