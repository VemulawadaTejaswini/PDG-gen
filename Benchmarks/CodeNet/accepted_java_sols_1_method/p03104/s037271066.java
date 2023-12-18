import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		if(A%2==1&&B%2==1)
			if((B-A)/2%2==0)
				System.out.println(A^0);
			else
				System.out.println(A^1);
		if(A%2==0&&B%2==1)
			if((B-A+1)/2%2==0)
				System.out.println(0);
			else
				System.out.println(1);
		if(A%2==1&&B%2==0)
			if((B-A-1)/2%2==0)
				System.out.println(A^B);
			else
				System.out.println(A^B^1);
		if(A%2==0&&B%2==0)
			if((B-A)/2%2==0)
				System.out.println(B^0);
			else
				System.out.println(B^1);
	}
}