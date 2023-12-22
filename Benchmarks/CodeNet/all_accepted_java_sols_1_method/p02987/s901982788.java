import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        String out = new String(sc);
        System.out.println(out.charAt(0) == out.charAt(1) && out.charAt(2) == out.charAt(3) && out.charAt(0) != out.charAt(2) ? "Yes" : "No");
        scan.close();
    }
}