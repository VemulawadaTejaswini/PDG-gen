import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N  = scan.nextInt();
	        int D  = scan.nextInt();
	        int i=0;
	        int x =  N;

	        for(i=0; x > 0;i++) {
	        	x -= 2*D+1;
	        }
	        System.out.println(String.valueOf(i ));
	}
}
