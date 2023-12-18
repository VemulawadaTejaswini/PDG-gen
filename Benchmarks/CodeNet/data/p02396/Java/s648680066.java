import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int x = scan.nextInt();
		numbers.add(x);

		while(x != 0){
			x = scan.nextInt();
			numbers.add(x);
		}

		for(int i = 0; i < numbers.size(); i++){
			System.out.println("Case " + i + ": " + numbers.get(i));
		}
	}
}