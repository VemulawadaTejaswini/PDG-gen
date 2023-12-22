import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        final int TARGET = 3200;
        if(a >= TARGET) {
        	System.out.println(s);
        } else {
        	System.out.println("red");        	
        }
	}
}