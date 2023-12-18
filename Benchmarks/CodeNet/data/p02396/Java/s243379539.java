import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int i = 0;
		int x = Integer.parseInt(str);

		do{
			i++;
		}while(x != 0);	
		
		System.out.println("case " + i + ": " + x );