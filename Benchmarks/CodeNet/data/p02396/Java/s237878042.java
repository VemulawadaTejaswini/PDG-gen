import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x;
		int i = 0;
		for(;;){
			x = scan.nextInt();
			++i;
			System.out.println("Case "+i+": "+x);
		}
		
	}
}