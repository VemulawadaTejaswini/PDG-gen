import java.util.Scanner;
public class Main {
public static void main(String []args) {
	Scanner tc = new Scanner (System.in);
	int a,b;
	a = tc.nextInt();
	b = tc.nextInt();
	
	if(b%2==0) {
if(a<=5) {
	System.out.println(b*0);
			
		}
if(a>=6 && a<=12) {
	System.out.println(b/2);
	
}
		if(a>=13) {
			System.out.println(b);
		}
		
	}
}
}