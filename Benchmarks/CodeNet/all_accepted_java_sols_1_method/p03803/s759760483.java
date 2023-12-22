import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int A = sn.nextInt();
		int B = sn.nextInt();
		if(A == 1){
			A = 14;
		}
		if(B == 1){
			B = 14;
		}
		if(A<B){
			System.out.print("Bob");
		}else if(A>B){
			System.out.print("Alice");
		}else{
			System.out.print("Draw");
		}

	}

}
