import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(Character.isUpperCase(n.charAt(0)))System.out.println('A');
        else System.out.println('a');
    }
}
