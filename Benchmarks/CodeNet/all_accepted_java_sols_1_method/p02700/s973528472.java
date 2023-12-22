import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int D=stdIn.nextInt();
		
		while(A>0&&C>0) {
			C=C-B;
			if(C<=0)break;
			A=A-D;
		}
		if(A<=0)
			System.out.println("No");
		else
			System.out.println("Yes");

	}

}