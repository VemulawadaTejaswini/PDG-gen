import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i =0;i<n;i++) {
			String s = in.next();
			if (s.length()==l && s.equals(s.toLowerCase())) {
				list.add(s);
			}
		}
		Collections.sort(list);
		
		
		
		for (int i =0 ;i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}

}
