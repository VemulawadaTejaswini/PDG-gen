import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		while(true) {
			char[] serve = scan.next().toCharArray();
			
			if(serve[0] == '0') break;
			
			a = 0;
			b = 0;
			
			for(int i = 1; i < serve.length; i++) {
				if(serve[i] == 'A') {
					a++;
					
				} else {
					b++;
					
				}
			}
			if(a > b) {
				a++;
				
			} else {
				b++;
				
			}
			System.out.println(a + " " + b);
		}
		
		scan.close();
	}
}