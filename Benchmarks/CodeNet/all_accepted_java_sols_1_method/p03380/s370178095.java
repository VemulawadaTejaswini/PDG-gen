import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) list.add(sc.nextInt());
		Collections.sort(list);
		int max = list.get(list.size()-1);
		Collections.sort(list, (i1,i2) -> Math.abs((int)((double)max/2 - (double)i1)) - Math.abs((int)((double)max/2 - (double)i2)));
		System.out.println(max + " " + list.get(0));
	}
}
