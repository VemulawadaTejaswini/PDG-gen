import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); int B = sc.nextInt();
		String string = sc.next();
		for(int i=0;i<A;i++) 
			if('0' > string.charAt(i)  || '9' < string.charAt(i)) 
				{
					System.out.println("No"); 
					System.exit(0);
				}
		
		if(string.charAt(A)  != '-') 
			{
				System.out.println("No");
				System.exit(0);
			}
		
		for(int i=A+1;i<A+B;i++) 
			if('0' > string.charAt(i)  || '9' < string.charAt(i)) 
				{
					System.out.println("No"); 
					System.exit(0);
				}
		System.out.println("Yes");
	}

}
