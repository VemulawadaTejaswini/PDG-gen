import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String A = stdIn.next();
		if(A == A.toLowerCase()){
			System.out.println("a");
		}
		else{
			System.out.println("A");
		}
		stdIn.close();
	}
}