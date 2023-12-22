import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
       
       s = s.replaceAll("0","");
       int count = s.length();
       System.out.println(count);
    }
}