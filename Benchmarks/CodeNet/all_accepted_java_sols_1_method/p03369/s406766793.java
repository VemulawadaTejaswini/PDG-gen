import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int add = 0;
		
		if(s.substring(0,1).equals("o")) {
			add += 100;
		}
		if(s.substring(1,2).equals("o")) {
			add += 100;
		}
		if(s.substring(2,3).equals("o")) {
			add += 100;
		}
		
		
		System.out.println(700 + add);
		
		sc.close();
	}
}