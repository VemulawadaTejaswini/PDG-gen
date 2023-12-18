import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt();
		if(Math.abs(x-a)>Math.abs(x-b)) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}

	}

}