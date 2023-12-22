import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		for(int counter = 0; counter < 4; counter++)
			array.add(sc.nextInt());
		List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);
		System.out.println(array.containsAll(list) ? "YES" : "NO");
			
	}
}
