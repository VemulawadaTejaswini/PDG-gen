import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        long a = (long) in.nextInt();
        a = a + a*a + a*a*a;
        System.out.println(a);
    }
}
