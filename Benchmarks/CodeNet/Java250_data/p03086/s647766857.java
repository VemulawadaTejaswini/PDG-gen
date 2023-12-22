import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;

		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			for(int j = s.length(); j >i;j--) {
				String temp = s.substring(i,j);
				if(temp.matches("[A,T,C,G]{0,}")) {
					
				if(temp.length() > max) {
					max = temp.length();
				}
				}
			}
		}
		System.out.println(max);
	}

}