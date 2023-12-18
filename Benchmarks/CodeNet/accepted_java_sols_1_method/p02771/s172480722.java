import java.util.HashSet;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		String[] inputstrArray = inputString.split(" ");
		int input1 = Integer.parseInt(inputstrArray[0]);
		int input2 = Integer.parseInt(inputstrArray[1]);
		int input3 = Integer.parseInt(inputstrArray[2]);

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(input1);set.add(input2);set.add(input3);

		switch(set.size()) {
		case 1:
		System.out.println("No");
		break;
		case 2:
		System.out.println("Yes");
		break;
		case 3:
		System.out.println("No");
		break;

		}
	}
}