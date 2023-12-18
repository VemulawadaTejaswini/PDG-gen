import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	int len = s.length();

	System.out.println(s.charAt(0)+""+(len-2)+""+s.charAt(len-1));
    }
}
