import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        s += t.charAt(t.length() - 1);
        if(s.equals(t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}