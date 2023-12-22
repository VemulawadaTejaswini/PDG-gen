import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(scan.nextInt());
		list.add(scan.nextInt());
		list.add(scan.nextInt());
		Collections.sort(list);
		for (int i = 0; i < 3; i++) {
			System.out.print(list.get(i));
			if(i<2)
				System.out.print(" ");
		}
		System.out.println();
	}

}