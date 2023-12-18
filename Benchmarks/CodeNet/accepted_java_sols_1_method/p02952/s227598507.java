import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i<=N ; i++) {
			int length = (String.valueOf(i)).length();
			if(length %2 != 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();	
	}

}