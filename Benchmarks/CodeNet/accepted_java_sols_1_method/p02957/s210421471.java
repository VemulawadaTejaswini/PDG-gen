import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		long m=input.nextLong(), n=input.nextLong();
		long rem=(m+n)%2;
		
		if(rem==0)
			System.out.println((m+n)/2);		
		else
			System.out.println("IMPOSSIBLE");
		
	}

}
