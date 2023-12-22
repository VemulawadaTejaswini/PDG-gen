import java.lang.reflect.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<Integer>();
		for ( int i = 0; i < 3; i++ )
			in.add(sc.nextInt());
		Collections.sort(in);
		System.out.println(in.get(0)+" "+in.get(1)+" "+in.get(2));
	}
}