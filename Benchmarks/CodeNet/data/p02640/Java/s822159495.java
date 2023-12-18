import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(!(y%2 == 0))System.out.println("No");
		int sa = y - (x * 2);
		if( sa >= 0 && ( sa/2 ) <= x ) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}

	}

}