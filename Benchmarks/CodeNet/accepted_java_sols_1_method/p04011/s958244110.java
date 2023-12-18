import java.math.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader=new Scanner(System.in);
	int N= reader.nextInt();
	int K= reader.nextInt();
	int X= reader.nextInt();
	int Y= reader.nextInt();
	int SUM=0;
	for(int i=1;i<=Math.min(K,N);i++) {
		SUM=SUM+X;
	}

	for(int i=K+1;i<=N;i++) {
		SUM=SUM+Y;
	}
	System.out.print(SUM);

	}

}
