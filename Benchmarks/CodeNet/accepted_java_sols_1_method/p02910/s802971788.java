import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char[] c = s.toCharArray();
		boolean check = true;
		
		for(int i=0;i<c.length;i++) {
			char a = c[i];
			if(i%2==0) {
				if(a == 'L') {
					check = false;
				}
			}else {
				if(a == 'R') {
					check = false;
				}
			}
		}
		
		if(check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();	
	}
}