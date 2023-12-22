import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		sc.close();
		boolean result=false;
		int legs=0;
		for(int i=0;i<=X;i++) {
			legs=(i*2)+((X-i)*4);
			if(legs==Y)
				result=true;
		}
		if(result==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
