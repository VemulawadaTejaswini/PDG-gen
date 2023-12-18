import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int N=reader.nextInt();
		int A=reader.nextInt();
		int B=reader.nextInt();
		System.out.print(Math.min(A*N,B));
	}

}
