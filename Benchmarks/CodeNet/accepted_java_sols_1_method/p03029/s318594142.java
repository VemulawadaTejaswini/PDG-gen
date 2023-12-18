import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        String[] rows = in.nextLine().split(" ");
        int a = Integer.parseInt( rows[0] );
        int p = Integer.parseInt( rows[1] );
        System.out.println(( a * 3 + p )/2);

    }
}