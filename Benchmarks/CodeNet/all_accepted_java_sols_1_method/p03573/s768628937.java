import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int A=reader.nextInt();
		int B=reader.nextInt();
		int C=reader.nextInt();
		if(A==B && C!=A) {
			System.out.print(C);
		}
		else if(A==C && B!=A) {
			System.out.print(B);
		}
		else {
			System.out.print(A);
		}
	}
	
	

}
