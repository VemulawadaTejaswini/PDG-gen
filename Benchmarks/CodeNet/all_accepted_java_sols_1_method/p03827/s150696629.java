import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		char[] sString = sc.next().toCharArray();


		int num = 0;
		int ans = 0;
		for (int i = 0; i < sString.length; i++) {
			if (sString[i] == 'I'){
				num ++;
				if (ans < num){
					ans = num;
				}
			}else {
				num --;
			}
		}
		System.out.println(ans);
	}
}
