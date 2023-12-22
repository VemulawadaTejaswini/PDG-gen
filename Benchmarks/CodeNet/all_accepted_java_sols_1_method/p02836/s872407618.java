import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String data = sc.nextLine();

			// List<Integer> list = new ArrayList<>();
	 		// for (String s : data.split("\\s+")) {
			// 	list.add(Integer.parseInt(s));
			// }

			int sz = data.length();
			int res = 0;

			for (int i=0; i<sz/2; i++) {
				if (data.charAt(i) != data.charAt(sz-1-i)) {
					res ++;
				}
			}

			System.out.println(res);
		}
	}
}
