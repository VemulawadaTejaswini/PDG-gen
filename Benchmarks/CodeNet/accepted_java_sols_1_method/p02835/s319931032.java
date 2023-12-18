import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String data = sc.nextLine();

			List<Integer> list = new ArrayList<>();
	 		for (String s : data.split("\\s+")) {
				list.add(Integer.parseInt(s));
			}

			int sum = 0;
			for (int x : list) sum += x;

			if (sum >= 22)
	        	System.out.println("bust");
			else
				System.out.println("win");
		}
	}
}
