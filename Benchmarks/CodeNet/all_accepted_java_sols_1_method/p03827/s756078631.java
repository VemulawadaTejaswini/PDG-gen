import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int max = 0;
		int n = sc.nextInt();
		String s = sc.next();
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I')
				x++;
			else if (s.charAt(i) == 'D')
				x--;
			
			if (max < x)
				max = x;
		}
		
		System.out.println(max);
	}
}