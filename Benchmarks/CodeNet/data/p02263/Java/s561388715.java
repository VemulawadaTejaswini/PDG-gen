import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] all = line.split(" ");
		
		ArrayList<Integer> allint = new ArrayList<Integer>();
		
		for (int i = 0; i < all.length; i++) {
			if (judge(all[i]) == true) {
				allint.add(Integer.parseInt(all[i]));
			} else if (all[i].equals("+")) {
				if (allint.size() == 3) {
					allint.set(1, allint.get(1) + allint.get(2));
					allint.remove(2);
				} else {
					allint.set(0, allint.get(0) + allint.get(1));
					allint.remove(1);
				}

			} else if (all[i].equals("-")) {
				if (allint.size() == 3) {
					allint.set(1, allint.get(1) - allint.get(2));
					allint.remove(2);
				} else {
					allint.set(0, allint.get(0) - allint.get(1));
					allint.remove(1);
				}

			} else if (all[i].equals("*")) {
				if (allint.size() == 3) {
					allint.set(1, allint.get(1) * allint.get(2));
					allint.remove(2);
				} else {
					allint.set(0, allint.get(0) * allint.get(1));
					allint.remove(1);
				}

			}
			
		}
		
		System.out.println(allint.get(0));
		
		
	}

	String n;
	
	public Test03_1(String n) {
		super();
		this.n = n;
	}

	public static boolean judge(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}