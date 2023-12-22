import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<3;i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list,Comparator.reverseOrder());
		
		String num1=list.get(0).toString()+list.get(1).toString();
		System.out.println(Integer.valueOf(num1)+list.get(2).intValue());
		
		sc.close();
	}
}