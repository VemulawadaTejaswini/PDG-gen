import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        boolean coffeeLike=true;
        if (s.charAt(2)!=s.charAt(3)){
            coffeeLike=false;
        }
        if (s.charAt(4)!=s.charAt(5)){
            coffeeLike=false;
        }
        System.out.println(coffeeLike? "Yes" : "No");
    }
}
