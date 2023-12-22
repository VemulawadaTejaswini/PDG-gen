import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oddCount = 0;
		
		for(int i=1; i<=N; i++) {
			String temp = String.valueOf(i);
			if(temp.length() % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println(oddCount);
		sc.close();
	}
}