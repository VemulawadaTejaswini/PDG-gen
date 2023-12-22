import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int counter = 0;
		while(scan.hasNext()){
			str = scan.next();
			if(str.equals("0")) break;
			counter++;
			System.out.println("Case " + counter + ": " + str);

		}
	}
}