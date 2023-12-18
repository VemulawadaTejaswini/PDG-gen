import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 if(N<3) {
			 System.out.println("0");
		 }
		 else {
			 System.out.println(N/3);
		 }
	}

}
