import java.util.*;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		 char [] str = s.toCharArray();
		 for(int i=0;i<str.length;i++) {
			 if((i+2)%2 == 0) {
				 System.out.print(str[i]);
			 }
		 }
		 sc.close();
	}
}