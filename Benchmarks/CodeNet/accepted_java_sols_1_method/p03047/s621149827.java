import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//一列をintのArrayListに変換
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		ArrayList<Integer> nl = new ArrayList<Integer>();
		for(String s: l) {
			nl.add(Integer.parseInt(s));
		}

		System.out.println(nl.get(0)-nl.get(1)+1);
	}
}