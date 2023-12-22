import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		String str=input.next();
		char[] a = str.toCharArray();
		
		if((a[2]==a[3])&&(a[4]==a[5])) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}	
}
