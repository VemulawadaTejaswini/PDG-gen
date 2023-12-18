import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			list.add(scan.nextInt());
		}
		
		for(int i = list.size()-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
	
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		
		
		
	}

}

