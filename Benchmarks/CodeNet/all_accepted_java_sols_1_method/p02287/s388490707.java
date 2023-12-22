
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int treeLength = in.nextInt();
		ArrayList<Integer> values = new ArrayList<>();
		for (int i=0; i<treeLength; i++) {
			int tempInt = in.nextInt();
			values.add(tempInt);
		}
		//reading input complete
		for (int i=0; i<values.size(); i++) {
			System.out.print("node "+(i+1)+": key = "+values.get(i)+", ");
			if (i>0) {
				System.out.print("parent key = "+values.get((i-1)/2)+", ");
			}
			if ((2*i+1)<values.size()) {
				System.out.print("left key = "+values.get(2*i+1)+", ");
			}
			if ((2*i+2)<values.size()) {
				System.out.print("right key = "+values.get(2*i+2)+", ");
			}
			System.out.println();
		}
	}

}

