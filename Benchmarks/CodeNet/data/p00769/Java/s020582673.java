import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(solve(str));
		}
	}

	static long solve(String str) {
		str = str.substring(1, str.length()-1);
		if(str.charAt(0)=='[') {
			List<Long> childList = new LinkedList<>();
			long ans =0;
			while(str.length() != 0) {
				int bracketIdx = 1;
				int charIdx =1;
				while(bracketIdx != 0) {
					char i = str.charAt(charIdx);
					if(i == ']') {
						bracketIdx--;
					}else  if (i=='['){
						bracketIdx++;
					}
					charIdx++;
				}
				childList.add(solve(str.substring(0, charIdx)));

				str = str.substring(charIdx);
			}
			childList.sort(null);
			for(int i = 0; i < childList.size()/2+1; i++) {
				ans+= childList.get(i);
			}
			return ans;
		}else {
			return Long.valueOf(str)/2L+1;
		}
	}
}

