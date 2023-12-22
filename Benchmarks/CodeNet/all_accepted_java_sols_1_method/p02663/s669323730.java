import java.util.*;

public class Main{
//public class abc167_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int k = scan.nextInt();

		int f1 = h1 *60 +m1;
		int f2 = h2* 60 + m2;

		int ans = f2 - (f1 +k);
		if(ans <= 0){
			System.out.println( 0);
		}else{
			System.out.println( ans );
		}

	}

}