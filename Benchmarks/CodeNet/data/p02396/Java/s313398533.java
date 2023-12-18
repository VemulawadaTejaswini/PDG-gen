import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Integer> ArrayList = new ArrayList<Integer>();
		int lastAdd;
		int counter = 0;
		do {
			lastAdd = stdIn.nextInt();
			ArrayList.add(lastAdd);
			counter++;
			
		}while(lastAdd != 0);
		
		for(int i = 0; i < ArrayList.size()-1; i++) {
			System.out.println("Case " + (i+1) + ": " + ArrayList.get(i));
		}
	}
}