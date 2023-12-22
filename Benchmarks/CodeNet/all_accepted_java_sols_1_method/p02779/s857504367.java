import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		List<Integer> list2 = new ArrayList<Integer>(new HashSet<>(list));


		if(list2.size() != n) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}


	}

}