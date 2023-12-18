package hills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		// TODO ?????????????????????????????????????????????
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<10; i++){
			Scanner scan = new Scanner(System.in);
			String stra = scan.next();
			int str = Integer.parseInt(stra);
			 list.add(str);
		}
		Collections.sort(list);


		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

}