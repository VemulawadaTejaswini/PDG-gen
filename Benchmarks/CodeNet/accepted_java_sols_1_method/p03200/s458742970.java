import java.util.Scanner;
//AGC029A
//Main
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int len = S.length();
		long count = 0;
		int num = 0;
		int R[] = new int[len];
		int BWcnt = 0;

		for(int i = 0; i< len;i++) {
			if(S.substring(i, i+1).equals("W")) {
				count+= i-num;
				num++;
				BWcnt++;
			}
		}
		if(BWcnt == 0||BWcnt == len) {
			count=0;
		}

		System.out.println(count);

	}

}