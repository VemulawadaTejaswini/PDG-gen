import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String ans = "NO";
        if(a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1)==c.charAt(0))
            ans = "YES";
        System.out.println(ans);
    }
}