import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		for ( int i = 1;i <10;i++) {
			if(n%i==0 & n/i<10) {
				System.out.println("Yes");
				break;
			}else if (i==9) {
				System.out.println("No");
			}
			
		}
		
	}
 
}
