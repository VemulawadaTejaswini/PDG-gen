import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char check, bCheck;
		int Count = 0;
		bCheck = str.charAt(0);
		for(int i = 1; i < N; i++) {
			check = str.charAt(i);
			if(check != bCheck) {
				Count++;
			}
			bCheck = check;
		}
		System.out.println(Count+1);
	}
}