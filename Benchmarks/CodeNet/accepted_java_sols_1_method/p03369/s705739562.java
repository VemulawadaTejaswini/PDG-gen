import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int count = 0;
		for(int i = 0; i <= 2; i++) {
			if(S.substring(i, i+1).equals("o")){
				count++;
			}else {
				continue;
			}
		}
		System.out.println(700 + 100 * count);
	}
}