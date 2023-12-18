import java.util.*;

public class Main {
	public static void main(String[] args){
		int i;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] tmp = new char[50];
		for ( i = 0; i < str.length(); i++ )
			tmp[i] = str.charAt(i);
		for ( i=i-1; i >= 0; i-- )
			System.out.print(tmp[i]);
		System.out.println("");
	}
}