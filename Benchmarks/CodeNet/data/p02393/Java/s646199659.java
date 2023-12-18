import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		int temp;
		if(b > 0 && b <= 10000 && a > 0 && a <= 10000 && c > 0 && c <= 10000) {
		for(int i = 0; i < 3 ; i++) {
			if(b < a){
				temp = a;
							a = b;
							b = temp;
						} 
			
						if (c < b) {
							temp = b; 
							b = c;
							c = temp;
						}  
					}
		System.out.print(a + " " + b + " " + c);
		}
		
		stdin.close();
	}
	
}