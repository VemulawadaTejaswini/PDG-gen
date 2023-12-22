import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int red;
        int blue;
        red=str.length()-str.replaceAll("1", "").length();
        blue=str.length()-str.replaceAll("0", "").length();
        System.out.println(Math.min(red,blue)*2);
        
    }
        
}