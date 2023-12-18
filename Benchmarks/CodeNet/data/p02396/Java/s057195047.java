import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		ArrayList<Integer> parse = new ArrayList<Integer>(); // int??????
		while (i <= 10000) { // ?????§10000???
			++i;
				Scanner scan = new Scanner(System.in);
				a = scan.nextInt();
				parse.add(a);
				if(a == 0){
					break;
				}
		}
		for(int j = 0; j < parse.size()-1; ++j){
		System.out.println("Case " + (j+1) + ": " + parse.get(j));
		}
	}
}