
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strCheck = sc.nextLine();

		int Count = 0;
		while(sc.hasNext()) {

			String strS = sc.next();
			if(strS.equals(strCheck)) {
				Count++;
			}
			if(strS.equals("END_OF_TEXT")) {
				//System.out.println("??????????????????");
				break;
			}
		}
		System.out.println(Count);
	}
}