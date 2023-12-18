
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s.replaceAll(",", " "));
    }
}