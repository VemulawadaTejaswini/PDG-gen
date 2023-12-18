import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	String T = sc.next();
	if((S + T.charAt(T.length()-1) ).equals(T))
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}
