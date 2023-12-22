import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();
		int max=0;
		if(A>B) {
			max=A+A-1;
		}else if(B>A) {
			max=B+B-1;
		}else if(A==B) {
			max=A+B;
		}

		System.out.println(max);
	}
}
