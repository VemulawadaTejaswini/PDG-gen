import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long tk = 1;
		long ao = 1;
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong();
			long a = sc.nextLong();
			
			long tn = tk / t + (tk % t == 0 ? 0 : 1);
			long an = ao / a + (ao % a == 0 ? 0 : 1);
			
			long num = Math.max(tn, an);
			
			tk = t * num;
			ao = a * num;
		}
		
		System.out.println(tk + ao);
		
		sc.close();
	}
}


