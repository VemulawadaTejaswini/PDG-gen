import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[4];
		int[] t = new int[2];
		
		t[0] = sc.nextInt();
		s[0] = sc.nextInt();
		s[3] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		t[1] = sc.nextInt();
		
		String command = sc.next();
		
		for(int i = 0; i < command.length(); i++) {
			char c = command.charAt(i);
			
			if(c == 'N') {
				int x = t[0];
				t[0] = s[0];
				s[0] = t[1];
				t[1] = s[2];
				s[2] = x;
			}else if(c == 'S') {
				int x = t[0];
				t[0] = s[2];
				s[2] = t[1];
				t[1] = s[0];
				s[0] = x;
			}else if(c == 'E') {
				int x = t[0];
				t[0] = s[1];
				s[1] = t[1];
				t[1] = s[3];
				s[3] = x;
			}else {
				int x = t[0];
				t[0] = s[3];
				s[3] = t[1];
				t[1] = s[1];
				s[1] = x;
			}
		}
		
		System.out.println(t[0]);
	}
}
