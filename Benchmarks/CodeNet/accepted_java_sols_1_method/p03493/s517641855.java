import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String marbles = scanner.nextLine();


    	System.out.println(marbles.replace("0", "").length());
    }
}