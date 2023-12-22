import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k=stdIn.nextInt();
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int x=0;
		
		for(int i = a;i<=b;i++) {
			if(i%k==0) {
				x=1;
				break;
			}
		}
		
		if(x==1) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
 
	}
 
}