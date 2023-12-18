import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ok = (s.charAt(2)==s.charAt(3))&&(s.charAt(4)==s.charAt(5));
        
        System.out.println(ok?"Yes":"No");
    }
}