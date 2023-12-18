import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();


		int sa = y - (x * 2);
		int kame = sa /2;
		int turu = x -kame;
		if( (sa%2==0) && kame >= 0&& turu >= 0) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}

	}

}