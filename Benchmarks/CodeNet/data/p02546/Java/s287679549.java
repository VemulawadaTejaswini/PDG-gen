import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int n = c.length;
        
        if (c[n-1] == 's') {
            str += "es";
        } else {
            str += "s";
        }
        System.out.println(str);
    }
}
