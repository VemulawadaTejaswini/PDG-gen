import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long num = 999L;
		String str = "";
		int sum = 0;
		int cnt = 0;
		ArrayList<String> charTbl = new ArrayList<>();
		ArrayList<Long> numTbl = new ArrayList<>();
		ArrayList<Integer> sumTbl = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			charTbl.add("");
			numTbl.add(0L);
		}
		
		while(num != 0) {
			num = sc.nextLong();
			str = String.valueOf(num);
			if(num == 0) {
				break;
			} else {
				for(int i = 0; i < str.length(); i++) {
					charTbl.set(i, str.substring(i, i + 1));
					numTbl.set(i, Long.parseLong(charTbl.get(i)));
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