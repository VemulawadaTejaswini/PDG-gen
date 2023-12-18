import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String a;
		String b;
	
		
		for(int i =0; i < s.length(); i++) {
	
			a = String.valueOf(s.charAt(i));
			
			if(a.equals("?")) {
			  if(i == 0) {
				  s.replaceFirst("?","P");
			  } else {
				  b = String.valueOf(s.charAt(i-1));
				  if(b.equals("P")) {
					  s.replaceFirst("?","D");
				  } else {
					  s.replaceFirst("?","P");
				  }
			  }
		}
		
		

	}
		System.out.println(s);
	}
}
