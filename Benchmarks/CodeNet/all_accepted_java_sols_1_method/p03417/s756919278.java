import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {    	    	
        long N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();

		if (N>=2 && M>=2) System.out.println((N-2)*(M-2));
		else if (N==1 && M==1) System.out.println(1);
		else if (N==1) System.out.println(M-2);
		else System.out.println(N-2);	
		
		sc.close();
    }
}