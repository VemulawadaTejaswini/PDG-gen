import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            System.out.print( S.substring( i, i+1 ).equals("1") ? "9" : "1" );
        }
        sc.close();
    }
}