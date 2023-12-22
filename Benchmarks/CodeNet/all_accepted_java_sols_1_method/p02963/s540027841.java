import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.length() == 19) {
            System.out.println("0 0 1000000000 1 0 1000000000");
            return;
        }
        while (str.length() != 18) {
            str = "0" + str;
        }
        
        String str1 = str.substring(0,9);
        String str2 = str.substring(9,18);
        int num1 = Integer.parseInt(str1) + 1;
        int num2 = 1000000000 - Integer.parseInt(str2);
        
        String str3 = Integer.toString(num1);
        String str4 = Integer.toString(num2);
        
        System.out.println("0 0 1000000000 1" + " " + str4 + " " + str3);
    }
}
