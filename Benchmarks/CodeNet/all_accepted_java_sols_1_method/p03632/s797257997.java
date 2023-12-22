import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() , b = sc.nextInt(), 
				c = sc.nextInt(), d = sc.nextInt();
		
		if(Math.min(b, d)-Math.max(a, c)>0) {
			System.out.print(Math.min(b, d)-Math.max(a, c));
		}
		else System.out.print("0");
	}

}