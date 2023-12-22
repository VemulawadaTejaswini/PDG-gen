import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		Set<String> set=new HashSet<>();
		for(int i=0;i<num;i++) {
			set.add(sc.next());
		}
		System.out.println(set.size());
	}

}
