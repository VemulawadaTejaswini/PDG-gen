import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        for (int i=0; i<str1.length(); i++) {
            if (str1.equals(str2)) {
                System.out.println("Yes");
                return;
            }
            str1 = str1.substring(str1.length()-1) + str1.substring(0, str1.length()-1);
        }
       System.out.println("No");
    }
}
