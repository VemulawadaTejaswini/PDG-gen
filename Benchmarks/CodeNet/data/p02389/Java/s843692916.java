import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.print(a+" "+b);
		
		if(a>=1 && a<=100){
			if(b>=1 && b<=100){
				System.out.print(a*b+" ");
				System.out.println(a*2+b*2);
			}
		}
		
	}
	
}