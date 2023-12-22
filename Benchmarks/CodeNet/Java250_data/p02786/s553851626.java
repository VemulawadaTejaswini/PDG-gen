import java.util.*;

public class Main {

    public static long attack( long h ){
        if( h == 1 ){
            return 1;
        }
        return 2 * attack( h / 2 ) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.nextLine());
        System.out.println( attack( h ) );

    }

}
