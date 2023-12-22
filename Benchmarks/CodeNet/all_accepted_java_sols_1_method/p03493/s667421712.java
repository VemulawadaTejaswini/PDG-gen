import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1の数
		int cnt =0;
		String S = sc.next();
for(int num =0; S.length()>num; num++) {
	if(S.charAt(num) == '1') {
		cnt++;
	}
}
		System.out.println(cnt);

	}
}