import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    scan.close();
    if ('A' <= str.charAt(0) && str.charAt(0) <= 'Z') {
        System.out.println("A");
    } else {
        System.out.println("a");
    }
}
}
