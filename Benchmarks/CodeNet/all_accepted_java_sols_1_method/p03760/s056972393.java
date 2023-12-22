import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		String ans = "";
		boolean b = true;
		int cnt = 0;
		int len = O.length()+E.length();
		int i = 0;
		int j = 0;

		while(b) {
            if(cnt >= len) {
                break;
            }
			if(cnt%2 == 0) {
				ans += O.charAt(i);
				i++;
			} else if(cnt%2 != 0) {
				ans += E.charAt(j);
				j++;
			}
			cnt++;
		}

		System.out.println(ans);
	}

}
