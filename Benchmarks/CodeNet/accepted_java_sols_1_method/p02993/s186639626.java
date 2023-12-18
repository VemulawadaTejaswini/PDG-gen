import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
			String s = sc.next();
			char  [] c = s.toCharArray();
				
			if(c[0] == c[1]) {
				System.out.println("Bad");
			}else if(c[1] == c[2]) {
				System.out.println("Bad");
			}else if(c[2] == c[3]){
				System.out.println("Bad");
			}else {
				System.out.println("Good");
			}			
	}
}