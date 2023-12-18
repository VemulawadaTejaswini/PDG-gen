import java.util.ArrayList;
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
		
		int min = 0, max = 0;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				min = list.get(i);
				max = list.get(i);
			}
			
			if(min > list.get(i)) {
				min = list.get(i);
			}
			
			if(max < list.get(i)) {
				max = list.get(i);
			}
			
			sum += list.get(i);
		}
		
		System.out.println(min + " " + max + " " + sum);
		
	}

}

