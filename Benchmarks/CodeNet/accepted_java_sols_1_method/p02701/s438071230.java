import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];

		int i = 0;
		while(i < n) {
			s[i] = sc.next();

			i++;
		}

		Arrays.sort(s);
		int counter = 1;
		for(i = 1 ; i < n ; i++) {
			if(s[i].equals(s[i-1])) {
				counter--;
			}
			counter++;
		}
		System.out.println(counter);

	}

}
