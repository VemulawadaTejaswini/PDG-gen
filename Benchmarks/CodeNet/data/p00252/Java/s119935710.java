import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b1 = sc.nextInt(), b2 = sc.nextInt(), b3 = sc.nextInt();
		
		if(b1 == 1 && b2 == 1 || b3 == 1){
			System.out.println("Open");
		}else{
			System.out.println("Close");
		}
		
		sc.close();
	}
}