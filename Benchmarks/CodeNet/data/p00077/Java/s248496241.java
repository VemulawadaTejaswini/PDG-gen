import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> after = new ArrayList<>();
		List<String> ansArray = new ArrayList<>();
		
		String in, ans = "";
		String[] before;
		int tmp;
		for(int i = 0; i < 2; i++) {
			in = sc.next();
			before = in.split("");
			
			for(int j = 0; j < before.length; j++) {
				if(before[j].equals("@")) {
					tmp = Integer.parseInt(before[j + 1]);
					for(int k = 0; k < tmp; k++) {
						after.add(before[j + 2]);
					}
					j += 2;
				} else {
					after.add(before[j]);
				}
			}
			
			for(int j = 0; j < after.size(); j++) {
				ans += after.get(j);
			}
			ansArray.add(ans);
			
			after.clear();
			ans = "";
		}
		
		for(String i : ansArray)	System.out.println(i);
	}
}