import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int n = 10000;
		int i = 1;
		ArrayList<Integer> parse = new ArrayList<Integer>(); // int??????
		while (true) { // ?????§10000???
				Scanner scan = new Scanner(System.in);
				a = scan.nextInt();
				parse.add(a);
				if(a == 0){
					break;
				}
				i++;
				if(i == n){
					break;
				}
		}
		for(int j = 0; j < parse.size()-1; ++j){
		System.out.println("Case " + (j+1) + ": " + parse.get(j));
		}
	}
}