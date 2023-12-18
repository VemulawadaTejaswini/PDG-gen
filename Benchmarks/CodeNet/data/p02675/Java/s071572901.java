
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner fastReader = new Scanner(System.in);
        int reach = fastReader.nextInt();
      	String s = fastReader.next();
        filter( reach, s );

    }

    private static void filter(int reach, String s) {

        int len = s.length();
        if( len <= reach ){
            System.out.println(s);
        }else{
            System.out.print( s.substring(0, reach ) + "..." );
        }

    }
}
