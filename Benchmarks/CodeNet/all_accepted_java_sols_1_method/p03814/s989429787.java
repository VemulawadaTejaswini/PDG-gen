import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = str.indexOf("A");
        int end = str.lastIndexOf("Z");
        String substr = str.substring(start, end + 1);
        System.out.println(substr.length());
    }
}
