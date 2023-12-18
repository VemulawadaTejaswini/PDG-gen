import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		
		if((Y - 2*X) >= 0 && (2*X - 0.5 * Y) >= 0 &&
				Y%2==0 && (Y-2*X)%2 == 0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}