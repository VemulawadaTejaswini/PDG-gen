import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner (System.in);
		int a=stdIn.nextInt();
		
		if(a/100==a%10)
		System.out.println("Yes");
		else
			System.out.println("No");
			
	}

}
