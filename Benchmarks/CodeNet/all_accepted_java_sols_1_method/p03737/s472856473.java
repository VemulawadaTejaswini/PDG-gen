import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        s3 = s3.toUpperCase();
        System.out.print(s1.charAt(0));
        System.out.print(s2.charAt(0));
        System.out.print(s3.charAt(0));
    }
}