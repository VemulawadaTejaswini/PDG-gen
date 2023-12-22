import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input1 = scan.next();
	int a = Integer.parseInt(input1);
	String input2 = scan.next();
	int b = Integer.parseInt(input2);
	String input3 = scan.next();
	int c = Integer.parseInt(input3);
	if (a < b && b < c) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}