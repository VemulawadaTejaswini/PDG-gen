import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		int temp;
		if (1 >= a && a <= 10000) {	
			if (1 >= b && b <= 10000) {
				if (1 >= c && c <= 10000) {
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
				}
			}
		}
		
		System.out.print(a + " " + b + " " + c);
	}

}