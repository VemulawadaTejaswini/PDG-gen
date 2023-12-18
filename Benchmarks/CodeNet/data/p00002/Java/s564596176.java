import java.util.*;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = a+b;
			String s = String.valueOf(sum);
			System.out.println(s.length());
		}
		
		
    }
}
