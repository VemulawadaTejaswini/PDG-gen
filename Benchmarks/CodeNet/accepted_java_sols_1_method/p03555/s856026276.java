import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        StringBuffer str = new StringBuffer(str1);
        String result = "NO";
        if (str.reverse().toString().equals(str2)) result = "YES";
        System.out.println(result);
    }
}
