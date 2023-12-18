import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String ans = "";
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c=='@') {
					char t = str.charAt(i+1);
					for(int j=0;j<t-'0';j++) {
						ans += str.charAt(i+2);
					}
					i += 2;
				}else {
					ans += c;
				}
			}
			System.out.println(ans);
		}
	}
}

