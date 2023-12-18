import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a + b == 2 || c == 1){
			System.out.println("Open");
		} else {
			System.out.println("Close");
		}
		
		
		sc.close();
	}

}