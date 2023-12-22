import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> lines = new ArrayList<String>();
		
		String string = "";
		int cn =0;
		while (true) {
			string = sc.nextLine();
			lines.add(string);
			cn++;
			if(string.equals("0")){
				break;
			}
		}
		
		int[] in = new int[cn];
		
		for (int i=0; i < cn;i++) {
			in[i] = Integer.parseInt(lines.get(i));
		}
		
		int j = 0;
		
		for (int number = 1;; number++) {
			if (in[j] == 0) {
				break;
			} else {
				System.out.print("Case ");
				System.out.print(number);
				System.out.print(": ");
				System.out.println(in[j]);
				j++;
			}
		}
	}

}