import java.util.*;
public class Main {
	    public static void main(String[] args) throws Exception {
	        
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        int A = scanner.nextInt();
	        int B = scanner.nextInt();
	        System.out.println(B % A == 0?A+B:B-A);
	    }
	}