import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N = input.nextInt();
		
		if(N%2==0) {
			System.out.println(N/2);
		}
		else {
			System.out.println((N+1)/2);
		}
	}

}
