import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++){
			int h = sc.nextInt();
			list.add(h);
		}
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(list.size()-2));
		System.out.println(list.get(list.size()-3));
	}

}