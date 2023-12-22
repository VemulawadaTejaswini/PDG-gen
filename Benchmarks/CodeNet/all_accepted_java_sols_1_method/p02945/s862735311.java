
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk = new Scanner(System.in);
		int a = jk.nextInt();
		int b = jk.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(a+b);
		arr.add(a-b);
		arr.add(a*b);
		System.out.println(Collections.max(arr));
	}

}
