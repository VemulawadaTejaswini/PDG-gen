import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = stdn.nextInt();
		b = stdn.nextInt();
		c = stdn.nextInt();
		
		if(a < b && a < c && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}