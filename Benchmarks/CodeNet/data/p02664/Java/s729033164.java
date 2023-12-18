import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();

		if(T.charAt(0) == '?') {
			sb.append('D');
			for(int i = 0; i < T.length(); i++) {
				if(T.charAt(i) != '?') {
					sb.append(T.charAt(i));
					continue;
				}else {
					if(T.charAt(i - 1) == 'P') {
						sb.append('D');
					}else {
						sb.append('D');
					}
				}
			}
		}else {
			for(int i = 0; i < T.length(); i++) {
				if(T.charAt(i) != '?') {
					sb.append(T.charAt(i));
					continue;
				}else {
					if(T.charAt(i - 1) == 'P') {
						sb.append('D');
					}else {
						sb.append('D');
					}
				}
			}
		}
		System.out.println(sb.toString());
	}

}