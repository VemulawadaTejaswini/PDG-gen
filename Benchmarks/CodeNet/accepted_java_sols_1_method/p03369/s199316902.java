import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String N = sc.next();
		int answer = 700;
		for(int i = 0; i < N.length(); i++) {
			if(N.charAt(i) == 'o') {
				answer += 100;
			}
		}
		System.out.println(answer);
	}
}