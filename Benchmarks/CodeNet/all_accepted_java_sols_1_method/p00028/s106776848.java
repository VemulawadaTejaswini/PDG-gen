import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		int [][] array = new int [100][2];
		
		int counter = 0;
		
		Scanner input = new Scanner (System.in);
		
		while (input.hasNext()) {
			int a = input.nextInt();
			boolean found = false;
			
			for (int i = 0; i < counter; i++) {
				if (array[i][0] == a) {
					array[i][1]++;
					found = true;
					
				}
			}
			
			if (!found) {
				array[counter][0] = a;
				array [counter][1] = 1;
				counter++;
			}
		}
		
		ArrayList<Integer> mode = new ArrayList<>();
		
		int max = array[0][1];
		
		for (int i = 1; i < counter; i++) {
			if (array[i][1] > max)
				max = array[i][1];
		}
		
		for (int i = 0; i < counter; i++) {
			if (array[i][1] == max)
				mode.add(array[i][0]);
		}
		
		Collections.sort(mode);
		
		for (int i = 0; i < mode.size(); i++) {
			System.out.println(mode.get(i));
		}

	}

}