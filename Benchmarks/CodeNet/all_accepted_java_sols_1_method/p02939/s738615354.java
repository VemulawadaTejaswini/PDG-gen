import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String n[] = sc.nextLine().split("");

		LinkedList<String> arr = new LinkedList<>(Arrays.asList(n));

		long cnt = 1;
		String beforeStr = arr.pop();

		while(true) {
			String str = arr.pop();

			if(str.equals(beforeStr)) {
				if(0 >= arr.size()) {
					break;
				}

				beforeStr = str + arr.pop();
			}else {
				beforeStr = str;
			}

			cnt++;
			if(0 >= arr.size()) {
				break;
			}
		}

		System.out.println(cnt);
	}
}