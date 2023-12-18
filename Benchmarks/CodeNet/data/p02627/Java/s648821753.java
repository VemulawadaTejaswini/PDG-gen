import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if(Pattern.matches("[A-Z]", a)) {
        	System.out.println("A");
        }else if(Pattern.matches("[a-z]", a)) {
        	System.out.println("a");
        }
        scanner.close();
    }
}