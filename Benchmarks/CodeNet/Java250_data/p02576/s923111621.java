import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int X = scanner.nextInt();
		    int T = scanner.nextInt();
		    int amari = N % X;
		    if(amari != 0) {
		    	int sho = N / X + 1;
		    	System.out.println(sho * T);
		    }else {
		    	int sho = N / X;
		    	System.out.println(sho * T);
		    }
}
}