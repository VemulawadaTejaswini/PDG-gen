import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(Math.abs(A-x)>Math.abs(B-x)){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}
}