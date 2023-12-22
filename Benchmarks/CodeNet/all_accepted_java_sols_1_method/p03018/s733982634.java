import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replace("BC", "D");
		String array[] = str.split("B|C");
		long ans = 0;
		for(int i = 0; i < array.length; i ++) {
			if(array[i].length() > 0) {
				int tmp = 0;
				for(int j = array[i].length() - 1; j >= 0; j --) {
					char c = array[i].charAt(j);
					if(c == 'D') {
						tmp ++;
					}else if(c == 'A') {
						ans += tmp;
					}
				}
			}
		}
		System.out.println(ans);
	}
}