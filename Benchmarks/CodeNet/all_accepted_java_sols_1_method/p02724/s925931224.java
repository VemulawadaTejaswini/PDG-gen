import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int X=sc.nextInt();
		
		int A=X/500;
		int B=(X-(500*A))/5;
		
		System.out.println((A*1000)+(B*5));
		
		sc.close();
	}
}