import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		long n = Long.parseLong(tmp[0]);
		long k = Long.parseLong(tmp[1]);
		Set<Integer> map = new HashSet<>();

		int num = 0;
		for(int i = 0; i < k; i++) {

			int now = Integer.parseInt(scanner.nextLine());
			String[] temp = scanner.nextLine().split(" ");
			for(int j = 0; j < now; j++) {

				num = Integer.parseInt(temp[j]);
				if(!map.contains(num)) map.add(num);


			}


		}

		System.out.println(n - map.size());


	}

}
