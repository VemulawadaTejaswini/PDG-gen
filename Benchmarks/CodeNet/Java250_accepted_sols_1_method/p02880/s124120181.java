import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if ( (i * j )== n) {
					flag = true;
					break;
				}
			}
		}
		if(flag)out.println("Yes");
		else out.println("No");
		
	}
}