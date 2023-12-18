import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> color = new ArrayList<Integer>();
		for(int i=0; i<3; i++) {
			int cl = scan.nextInt();
			if(!color.contains(cl))color.add(cl);
		}
		System.out.println(color.size());
 	}

}