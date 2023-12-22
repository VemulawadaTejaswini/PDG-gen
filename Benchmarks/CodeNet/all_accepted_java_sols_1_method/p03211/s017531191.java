import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int min = 999999999;
		
		for(int i = 0; i < s.length()-2; i++) {
			int n = Integer.parseInt(s.substring(i, i+3));
			
			int m = Math.abs(n - 753);
			
			if(min > m )	min = m;			
		}
		System.out.println(min);
		sc.close();

	}

}
