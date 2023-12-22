import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        System.out.println(in.charAt(0) + Integer.toString(in.length() - 2) + in.charAt(in.length() - 1));
    }

}