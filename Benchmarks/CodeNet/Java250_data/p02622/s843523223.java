import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		String T = sc.next();
		String S = sc.next();
      
		StringBuilder t = new StringBuilder();
		StringBuilder s = new StringBuilder();

		t.append(T);
		s.append(S);

		int count = 0;

		for(int i=0;i<t.length();i++) {      
			if(!t.substring(i,i+1).equals(s.substring(i, i+1))) count++;
		}

		System.out.println(count);

	}

}