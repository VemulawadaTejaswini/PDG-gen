import java.util.Scanner;

public class Main {


	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n	   = Integer.parseInt(sc.next());
		double answer = Math.pow(n, 3);
		System.out.println((int)answer);

		sc.close();
	}

}

