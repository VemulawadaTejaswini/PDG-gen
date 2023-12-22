import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        int answer = 0;
        int num = Integer.parseInt(str);
        
		for(int i = 1; i <= num; i++) {
			answer += i;
		}
		System.out.println(answer);
	}
}