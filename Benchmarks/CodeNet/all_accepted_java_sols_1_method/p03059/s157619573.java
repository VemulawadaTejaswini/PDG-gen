import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int A = scanner.nextInt();
	    int B = scanner.nextInt();
	    int T = scanner.nextInt();
	    
	    int time = A;
	    int count = 0;
	    while (time<T+0.5) {
	    	count += B;
	    	time+=A;
	    }
	    System.out.print(count);
	}
	    
}
