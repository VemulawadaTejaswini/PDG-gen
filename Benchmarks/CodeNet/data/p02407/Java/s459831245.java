import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		Collections.reverse(list);
		
		for(int i = 0; i < n; i++) {
			if(i == 0) System.out.print(list.get(i));
			else {
				System.out.print(" " + list.get(i));
			}
		}
		System.out.println();
	}

}

