import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int min = 0;
		int sum = 0;
		for(int i = 0; i < a; i++) {
			list.add(b);
			b++;
			sum += list.get(i);
		}
		min = list.get(0);
		for(int i = 0; i < list.size() - 1; i++) {
			if(Math.abs(list.get(i)) > Math.abs(list.get(i + 1))) {
				min = list.get(i + 1);
			}
		}
		System.out.println(sum - min);
	}
}