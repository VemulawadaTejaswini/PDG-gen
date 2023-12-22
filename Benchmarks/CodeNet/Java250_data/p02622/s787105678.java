import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        // char[] ss = new char[s.length()];
        // char[] tt = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if(si != ti){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}