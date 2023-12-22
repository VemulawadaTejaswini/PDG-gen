import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) ? "No" : "Yes");
    }
}