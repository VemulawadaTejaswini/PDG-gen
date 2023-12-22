import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x < 1200) {
			System.out.println("ABC");
		}else {
			System.out.println("ARC");
		}
	}

}
