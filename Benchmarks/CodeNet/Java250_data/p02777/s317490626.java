import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		
		int Sn = sc.nextInt();
		int Tn = sc.nextInt();
		
		String U = sc.next();
		
		if(U.contentEquals(S)) {
			Sn -= 1;
		    }
		if(T.contentEquals(U)) {
			Tn -= 1;	
			}
		System.out.println(Sn);
		System.out.println(Tn);
	
	}
	}