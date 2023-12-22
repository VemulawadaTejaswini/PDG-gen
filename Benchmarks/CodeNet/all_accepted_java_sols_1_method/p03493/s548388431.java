import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
/*		char[] s = stdIn.next().toCharArray();
		
		int sum = 0;
		for(char a: s) {
			if(a == '1') {
				sum++;
			}
		}
		System.out.println(sum);*/
		int cnt = 0;
		String[] s = stdIn.next().split(""); //splitを使う。toCharArray()を使う。substring()を使う方法がある
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("1")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
