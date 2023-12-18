import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();
	String t = s.replace(","," ");
	
	System.out.println(t);
    }
}
