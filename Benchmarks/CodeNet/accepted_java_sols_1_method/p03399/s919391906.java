import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int D=scan.nextInt();
		int s=0,temp=0;
		if(A<B){
			temp=A;
		}
		else if(B<=A){
			temp=B;
		}
		if(C<D){
			s=C;
		}
		else if(D<=C){
			s=D;
		}
		System.out.println(temp+s);
		}
}
