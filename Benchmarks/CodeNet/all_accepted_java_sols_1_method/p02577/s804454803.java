import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();


		char[] c = new char[s.length()];

		for(int i = 0; i < s.length(); i ++){
			c[i] = s.charAt(i);
		}

		int[] a = new int[s.length()];
		int sum = 0;

		for(int i = 0; i < s.length(); i ++){
			a[i] = Character.getNumericValue(c[i]);
		}

		for(int i = 0; i < s.length(); i ++){
			sum += a[i];
		}
		if(sum % 9 == 0)
		System.out.println("Yes");
		else
		System.out.println("No");

	}
}