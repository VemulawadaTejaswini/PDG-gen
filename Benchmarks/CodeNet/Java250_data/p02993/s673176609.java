import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

	String s = sc.next();
	String result = "Good";
	
	for (int i = 0; i < s.length() - 1; i++) {
		char c0 = s.charAt(i);
		char c1 = s.charAt(i + 1);
		
		if (c0 == c1) {
			result = "Bad";
		}
	}

    System.out.println(result);
  }
}

