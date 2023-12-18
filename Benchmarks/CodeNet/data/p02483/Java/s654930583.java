import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(scan.nextInt());
		list.add(scan.nextInt());
		list.add(scan.nextInt());
		Collections.sort(list);
		System.out.print(list.get(0)+" ");
		System.out.print(list.get(1)+" ");
		System.out.println(list.get(2));
		
	}

}