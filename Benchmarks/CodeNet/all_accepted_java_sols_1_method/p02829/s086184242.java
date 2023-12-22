import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		if(A == 1){
			if(B == 2){
				System.out.println(3);
			}
			else{
				System.out.println(2);
			}
		}
		else if(B == 1){
			if(A == 2){
				System.out.println(3);
			}
			else{
				System.out.println(2);
			}
		}
		else{
			System.out.println(1);
		}
		stdIn.close();
	}
}