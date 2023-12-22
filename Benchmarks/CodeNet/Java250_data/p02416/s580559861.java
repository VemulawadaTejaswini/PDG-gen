import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = "";
		int sum = 0;
		int cnt = 0;
		ArrayList<String> charTbl = new ArrayList<>();
		ArrayList<Integer> numTbl = new ArrayList<>();
		ArrayList<Integer> sumTbl = new ArrayList<>();
		
		for(int i = 0; i < 1000; i++) {
			charTbl.add("");
			numTbl.add(0);
		}
		
		while(!(str.equals("0"))) {
			str = sc.next();
			if(str.equals("0")) {
				break;
			} else {
				for(int i = 0; i < str.length(); i++) {
					charTbl.set(i, str.substring(i, i + 1));
					numTbl.set(i, Integer.parseInt(charTbl.get(i)));
				}
				for(int j = 0; j < str.length(); j++) {
					sum += numTbl.get(j);
				}
				sumTbl.add(sum);
				sum = 0;
				cnt++;
			}
		}
		for(int i = 0; i < cnt; i++) {
			System.out.println(sumTbl.get(i));
		}
	}
}