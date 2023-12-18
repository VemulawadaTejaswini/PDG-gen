import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = s;
        t = t.replace(t.charAt(2), t.charAt(3));
        t = t.replace(t.charAt(4), t.charAt(5));
        if(t.equals(s)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}