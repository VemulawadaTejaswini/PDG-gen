import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int pages = kb.nextInt();
		
		if(pages%2 == 1) {
			System.out.println((pages/2)+1);
		}
		else if(pages%2 == 0) {
			System.out.println(pages/2);
		}
	}

}
