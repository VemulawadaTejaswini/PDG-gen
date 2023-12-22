import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("A[a-z]+C[a-z]+")) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}