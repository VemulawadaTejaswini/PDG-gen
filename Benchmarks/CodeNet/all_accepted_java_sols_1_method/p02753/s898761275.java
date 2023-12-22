import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean b = s.equals("AAA") || s.equals("BBB");
        System.out.println(b?"No":"Yes");
    }
}