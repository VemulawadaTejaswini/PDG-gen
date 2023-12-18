import java.util.*;

public class Main {
	public static void main(String[] args) {
	  int a=0;
	  Scanner sc = new Scanner(System.in);
	  String s = sc.next();
	  char [] str = s.toCharArray();
	    for(int i=1;i<str.length-1;i++) {
		  a++;
	    }
	  System.out.print(str[0]);
	  System.out.print(a);
	  System.out.print(str[str.length-1]);
	  sc.close();
    }
}