import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l = s.length();
		int K = scan.nextInt();
		scan.close();
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < l; i++) {
			for(int j = 1; j <= K; j++) {
				if(i + j <= l) {
					list.add(s.substring(i, i + j));
				}else {
					break;
				}
			}
		}
		//System.out.println(list.size());
		Collections.sort(list);
		String ans = list.get(0);
		if(K==1) {
			System.out.println(ans);
			System.exit(0);
		}
		int cnt = 1;
		for(int i = 0; i < list.size(); i++) {
			if(!list.get(i).equals(list.get(i + 1))) {
				cnt ++;
				if(cnt == K) {
					ans = list.get(i + 1);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}