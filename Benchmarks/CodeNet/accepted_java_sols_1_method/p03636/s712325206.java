import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        System.out.println("" + s.charAt(0) + (n - 2) + s.charAt(n - 1));
    }
}