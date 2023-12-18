import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int aa = (c+b-1)/b; //高橋君が攻撃する回数
		int bb = (a+d-1)/d; 
		
		if(aa>bb) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		
	}

}
