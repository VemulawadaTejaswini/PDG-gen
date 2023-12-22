import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        StringBuffer str;
        String S_a, S_b, S_c, Sr_a, Sr_b, Sr_c;
        char card;

        S_a = sc.nextLine();
        S_b = sc.nextLine();
        S_c = sc.nextLine();

        str = new StringBuffer(S_a);
        Sr_a = str.reverse().toString();

        str = new StringBuffer(S_b);
        Sr_b = str.reverse().toString();

        str = new StringBuffer(S_c);
        Sr_c = str.reverse().toString();

        card = Sr_a.charAt(Sr_a.length()-1);
        Sr_a = Sr_a.substring(0, Sr_a.length() -1 );
        
        while (!Sr_a.isEmpty() || !Sr_b.isEmpty() || !Sr_c.isEmpty()) {
            if(card == 'a') {
                if(Sr_a.isEmpty()) break;

                card = Sr_a.charAt(Sr_a.length()-1);
                Sr_a = Sr_a.substring(0, Sr_a.length() -1 );

                
                continue;
            } else if(card == 'b') {
                if(Sr_b.isEmpty()) break;

                card = Sr_b.charAt(Sr_b.length()-1);
                Sr_b = Sr_b.substring(0, Sr_b.length() -1 );

                continue;
            } else if(card == 'c') {
                if(Sr_c.isEmpty()) break;

                card = Sr_c.charAt(Sr_c.length()-1);
                Sr_c = Sr_c.substring(0, Sr_c.length() -1 );

                continue;
            }
        }

        card -= 32;
        out.println(Character.toString(card));
        
        
        sc.close();
    }
}