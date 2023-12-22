import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	String c = scan.next(), str = "";

	for (int i=0; i<c.length(); i++) {
	    str = c.substring(i,i+1) + str; 
	}

	System.out.println(str);
    }
}