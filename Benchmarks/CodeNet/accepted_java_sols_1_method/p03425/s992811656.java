import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = 0;
		int a = 0; 
		int r = 0;
		int c = 0;
		int h = 0;
		
		for(int i = 0 ; i < n ;i++) {
			String s = sc.next();
			char x = s.charAt(0);
			if(x == 'M') m++;
			if(x == 'A') a++;
			if(x == 'R') r++;
			if(x == 'C') c++;
			if(x == 'H') h++;
			
			}
		long sum = 0;
		
		sum += (long)m * a * r;
		sum += (long)m * a * c;
		sum += (long)m * a * h;
		sum += (long)m * r * c;
		sum += (long)m * r * h;
		sum += (long)m * c * h;
		sum += (long)a * r * c;
		sum += (long)a * r * h;
		sum += (long)a * c * h;
		sum += (long)r * c * h;
		
		System.out.println(sum);
		
	
	}
}
