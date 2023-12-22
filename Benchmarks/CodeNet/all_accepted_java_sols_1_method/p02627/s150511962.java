import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char c= scanner.next().charAt(0);
        if(c-'A'<26)
        {
            System.out.println("A");
        }
        else
        {
            System.out.println("a");
        }
	// write your code here
    }
}