import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "A";
        char ch = str.charAt(0);
        if(ch>='a' && ch<='z'){
            result = "a";
        }
        System.out.println(result);
    }
}
