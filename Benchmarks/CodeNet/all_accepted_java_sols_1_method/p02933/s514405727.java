import java.util.Scanner;

public class Main {

	private final static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) {
    	int a = sc.nextInt();
        String s = sc.next();
        if(a < 3200) {
        	System.out.println("red");
        } else {
        	System.out.println(s);
        }
    }
}