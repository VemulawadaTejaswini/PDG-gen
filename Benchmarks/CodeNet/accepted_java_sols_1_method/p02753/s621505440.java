import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String string = scanner.next();
    	if (string.indexOf("A") >= 0 && string.indexOf("B") >= 0) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
    }
