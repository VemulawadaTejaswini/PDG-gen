import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String input = sc.next();
		ArrayList<Character> list = new ArrayList<>();
		boolean[] flag = new boolean[alphabet.length()];

		for(int i = 0; i < flag.length; i++) {
			flag[i] = true;
		}

		for(int i = 0; i < alphabet.length(); i++) {
			list.add(alphabet.charAt(i));
		}

		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).equals(input.charAt(i))) {
					flag[j] = false;
					break;
				}
			}
		}

		boolean all = true;

		for(int i = 0; i < flag.length; i++) {
			if(flag[i]) {
				System.out.println(list.get(i));
				all = false;
				break;
			}
		}

		if(all) {
			System.out.println("None");
		}


	}
}