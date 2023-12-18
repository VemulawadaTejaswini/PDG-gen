import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		ArrayList<String> arr = new ArrayList<String>();

		while((a = sc.nextInt()) != 0 | (b = sc.nextInt()) != 0){
			if(a >= b) arr.add(b + " " + a);
			else arr.add(a + " " + b);
		}

		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}

