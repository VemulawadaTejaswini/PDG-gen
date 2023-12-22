import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++){
			int tmp = sc.nextInt();
			list.add(tmp);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < 3; i++){
			int tmp = list.get(i);
			System.out.println(tmp);
		}
	}
}