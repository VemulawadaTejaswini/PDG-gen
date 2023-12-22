import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int l = n.length();
        System.out.println(n.substring(0, 1) + Integer.toString(l-2) + n.substring(l - 1, l));
    }
}