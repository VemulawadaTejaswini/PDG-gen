import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Integer> arraylistX = new ArrayList<Integer>();
		List<Integer> arraylistY = new ArrayList<Integer>();
		int lastAddX;
		int lastAddY;
		do {
			lastAddX = stdIn.nextInt();
			lastAddY = stdIn.nextInt();
			arraylistX.add(lastAddX);
			arraylistY.add(lastAddY);
			
		}while(lastAddX != 0 || lastAddY != 0);
		
		for(int i = 0; i < arraylistX.size()-1; i++) {
			if(arraylistX.get(i) < arraylistY.get(i)) {
				System.out.println(arraylistX.get(i) + " " + arraylistY.get(i));
			}
			else {
				System.out.println(arraylistY.get(i) + " " + arraylistX.get(i));
			}
		}
	}
}