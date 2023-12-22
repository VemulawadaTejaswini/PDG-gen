
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		if(str.charAt(2)==str.charAt(3) && str.charAt(4)==str.charAt(5)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

 }
