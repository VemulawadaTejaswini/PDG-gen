import java.util.*;

public class Main{
//public class abc166_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		/*
		int x3 = scan.nextInt();
		int x4 = scan.nextInt();
		int x5 = scan.nextInt();
		
		if(s.equals("ABC")){
			System.out.println("ARC");
		}else{
			System.out.println("ABC");
		}
		*/

		int sa = y -(x * 2);
		if( sa >= 0 && ( sa/2 ) <= x ) {
			System.out.println("Yes");
		} else{

			System.out.println("No");
		}

	}

}