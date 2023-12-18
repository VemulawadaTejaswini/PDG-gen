import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(String.valueOf((char)a.charAt(0)) + String.valueOf((char)b.charAt(0)) + String.valueOf((char)c.charAt(0)));
    }
}