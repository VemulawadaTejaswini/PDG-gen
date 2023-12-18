import static java.lang.System.out;

//import java.lang.reflect.Array;
//import java.math.BigInteger;
//import java.util.Arrays;
//import java.util.HashMap;
import java.util.Scanner;

    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        if(S.endsWith("s")) {
            out.println(S+"es");
        }
        else {
            out.println(S+"s");
        }


     }
