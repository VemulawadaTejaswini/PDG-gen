import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int z=0;
		if(A>=B){
			z+=A;
			A--;
		}
		else{
			z+=B;
			B--;
		}
		if(A>=B){
			z+=A;
			A--;
		}
		else{
			z+=B;
			B--;
		}
		System.out.println(z);
	}
}