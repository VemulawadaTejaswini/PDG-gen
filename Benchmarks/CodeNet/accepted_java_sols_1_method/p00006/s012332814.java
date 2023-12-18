import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] str = s.split("");
		for(String a : str){
			list.add(a);
		}
		Collections.reverse(list);
		
		for(String a : list){
			System.out.print(a);
		}
		System.out.println("");
	}

}