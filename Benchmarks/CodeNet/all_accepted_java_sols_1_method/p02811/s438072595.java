import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );

        int k = Integer.parseInt( params[0] );
        int x = Integer.parseInt( params[1] );

        System.out.println( k * 500 >= x ? "Yes" : "No" );

    }

}
