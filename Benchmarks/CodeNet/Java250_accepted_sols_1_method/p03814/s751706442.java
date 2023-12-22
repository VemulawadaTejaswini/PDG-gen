import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int getAIndex = 0;
		int getZIndex = 0;
		char[] ch =s.toCharArray();
		for(int i = 0;i < ch.length;i++) {
			if(ch[i] == 'A') {
				getAIndex = i;
				break;
			}
		}
		for(int i = ch.length-1;i > 0;i--) {
			if(ch[i] == 'Z') {
				getZIndex = i;
				break;
			}
		}
		System.out.println(getZIndex - getAIndex + 1);
	}
}