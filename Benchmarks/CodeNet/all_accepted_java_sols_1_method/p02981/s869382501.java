import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int a = Integer.parseInt(params[1]);
        int b = Integer.parseInt(params[2]);

        System.out.println((n*a<b)?(n*a):b);

        return;

    }
}