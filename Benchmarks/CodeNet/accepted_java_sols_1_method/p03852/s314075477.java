import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc049/tasks/abc049_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		String ans = "consonant";
		switch(c){
		case 'a':
		case 'i':
		case 'u':
		case 'e':
		case 'o':
			ans = "vowel";
		}
		
		System.out.println(ans);

	}

}