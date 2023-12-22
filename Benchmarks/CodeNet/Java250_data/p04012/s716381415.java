import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		for(char x: S.toCharArray()){
			int count = 0;
			for(char s: S.toCharArray()){
				if(x == s){
					count++;
				}
			}
			if (count%2==1){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		return;
	}
}