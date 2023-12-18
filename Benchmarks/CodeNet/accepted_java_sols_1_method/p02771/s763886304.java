import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int A = scanner.nextInt();
	    int B = scanner.nextInt();
	    int C = scanner.nextInt();
	    
	    if(A==B&&B!=C||A==C&&B!=C||C==B&&A!=C) {
    		System.out.println("Yes");
	    }else {
    		System.out.println("No");
	    }
  		scanner.close();

	}

}