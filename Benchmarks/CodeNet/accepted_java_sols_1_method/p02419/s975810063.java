import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);
		int count = 0;
		String W;
		ArrayList<String> Tline = new ArrayList<String>();

		W = sc.next();
		while(true) {
			String T = sc.next();
			if(T.equalsIgnoreCase(W)) {
				count++;
			}
			else if(T.equals("END_OF_TEXT")){
				break;
			}
		}
		System.out.println(count);
	}
}

