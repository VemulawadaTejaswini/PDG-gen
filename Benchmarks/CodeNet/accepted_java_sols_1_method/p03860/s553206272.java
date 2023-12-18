import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String splitted = new String();
        splitted = sc.next();
        splitted = sc.next();
        Character initial = splitted.toUpperCase().charAt(0);
        System.out.print("A"+initial+"C");
    }
}
