import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			count += (int)S.charAt(i) % 48;
		}
		
		if(S.length() - count < count) {
			count = S.length() - count;
		}
		System.out.println(count*2);
		sc.close();
	}
}
