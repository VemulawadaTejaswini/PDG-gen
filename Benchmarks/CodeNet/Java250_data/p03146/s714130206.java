import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int[] s = new int[10000];
		
		s[0] = stdIn.nextInt();
		
		for (int i = 0; ;i++) {
		
			if (s[i] % 2 == 0) {
				s[i + 1] = s[i] / 2;
			}
			
			else {
				s[i + 1] = 3 * s[i] + 1; 
			}
			
			for (int j = 0; j < i; j++) {
				if (s[i] == s[j]) {
					System.out.println(i + 1);
					return;
				}
			}
		}

	}
}