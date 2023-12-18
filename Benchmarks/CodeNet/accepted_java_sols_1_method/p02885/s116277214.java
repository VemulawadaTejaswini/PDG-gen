
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int A,B;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		int ans=A-2*B;
		if(ans<=0)
			System.out.println(0);
		else
			System.out.println(ans);
	}

}
