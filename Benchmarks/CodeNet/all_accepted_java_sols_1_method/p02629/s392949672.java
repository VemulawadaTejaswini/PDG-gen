import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		N = N-1;
		long div = N;
		int mod = 0;
		
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			mod = (int) (div % 26);
			div = div / 26;
			
			list.add(mod);
			
			if(div == 0) {
				break;
			}
			else {
				div = div -1;
			}
		}
		
		Collections.reverse(list);
				
		StringBuilder sb = new StringBuilder();
		
		for(int i : list) {
			char c = (char) (97 + i);
			sb.append(c);
		}
		System.out.println(sb);
	}
}