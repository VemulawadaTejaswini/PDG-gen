import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		List<Integer> inputNum = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			int num = in.nextInt();
			inputNum.add(num);
		}
		Collections.reverse(inputNum);
		for(int i = 0; i < inputNum.size();i++){
			System.out.print(inputNum.get(i) + " ");
		}
	}
}