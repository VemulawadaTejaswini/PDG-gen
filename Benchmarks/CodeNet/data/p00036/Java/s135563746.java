import java.util.*;
public class Main {

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int[] input = new int[8];
			for(int r = 0; r < 8; r++) {
				input[r] = stdIn.nextInt();
			}
			int count = 0;
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int r = 0; r < 8; r++) {
				if(input[r] != 0) {
					count++;
					temp.add(input[r]);
				}
			}
			switch(count) {
			case 1: System.out.println("C"); break;
			case 2:
				if(temp.get(0) - temp.get(1) == 0) {
					System.out.println("A");
				} else if(temp.get(0) > temp.get(1)) {
					System.out.println("E");
				} else if(temp.get(0) < temp.get(1)) {
					System.out.println("G");
				}
				break;
			case 3:
				if(temp.get(0) > temp.get(2)) {
					System.out.println("D");
				} else if(temp.get(0) < temp.get(2)) {
					System.out.println("F");
				}
				break;
			case 4: System.out.println("B"); break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}