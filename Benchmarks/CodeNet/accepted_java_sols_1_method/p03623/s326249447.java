import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		
		if(Math.abs(x-a) > Math.abs(x-b)) System.out.println("B");
		else System.out.println("A");
	}

}
