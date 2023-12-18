import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i<list.size()-1)
				System.out.print(" ");
		}
		System.out.println();
	}

}