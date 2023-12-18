import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < ch.length;i++) {
			if(sb.length()==0&&ch[i]=='B') {
				continue;
			}else if(sb.length() > 0&&ch[i]=='B') {
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
	}
}