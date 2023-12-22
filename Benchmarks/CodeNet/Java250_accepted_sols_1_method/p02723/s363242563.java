import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();

	char s3 = s.charAt(2);
	char s4 = s.charAt(3);
	char s5 = s.charAt(4);
	char s6 = s.charAt(5);

	if(s3==s4 && s5==s6)
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}
