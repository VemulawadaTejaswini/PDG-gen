import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		int c = sin.nextInt();
		if(0 <= a && a <= 100){
			if(0 <= b && b <= 100){
				if(0 <= c && c <= 100){
					if(a < b && b < c){
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}	
				}	
			}
		}
	}
}
