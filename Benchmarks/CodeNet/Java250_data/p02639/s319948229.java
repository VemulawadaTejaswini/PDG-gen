import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner cin=new Scanner(System.in);
			int q[]=new int[100];
			for(int i=1;i<=5;++i)q[i]=cin.nextInt();
			for(int i=1;i<=5;++i) {
				if(q[i]==0) {
					System.out.println(i);
					break;
				}
			}
	}
}
