import java.util.*;

class Main{

	public static void main(String[] args) {
		Scanner hoge = new Scanner(System.in);

		int a = hoge.nextInt();
		int b = hoge.nextInt();
		int c = hoge.nextInt();
		
		if(a < b && b < c) System.out.println("Yes");
		else System.out.println("No");

		

	}


}