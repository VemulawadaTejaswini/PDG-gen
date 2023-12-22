import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int n = s.length();
		
		StringBuffer sb = new StringBuffer();
		
		if(s.startsWith("0")) {
			for(int i=0; i<n; i++) {
				if(i%2==0) {
					sb.append(0);
				}else {
					sb.append(1);
				}
			}
		}else {
			for(int i=0; i<n; i++) {
				if(i%2==0) {
					sb.append(1);
				}else {
					sb.append(0);
				}
			}
		}
		String string = sb.toString();
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i)!=string.charAt(i)) {
				cnt++;
			}else {
				continue;
			}
		}
		System.out.println(cnt);
    }
}
