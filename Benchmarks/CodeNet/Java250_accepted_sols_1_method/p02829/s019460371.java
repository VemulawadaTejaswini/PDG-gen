import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<>();
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		sc.close();
		in.add(1);in.add(2);in.add(3);
		if(in.contains(a)) in.remove(a);
		if(in.contains(b)) in.remove(b);
		System.out.println(in.get(0));
	}
}
