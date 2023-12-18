import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	for(int i  = 0; i < 3; i++) {
	    char c1 = s.charAt(i);
	    char c2 = s.charAt(i+1);
	    if(c1 == c2) {
		System.out.println("Bad");
		System.exit(0);
	    }
	}
	System.out.println("Good");
	//while (true) {
	//int a =sc.nextInt();
	//System.out.println();
    }
}
