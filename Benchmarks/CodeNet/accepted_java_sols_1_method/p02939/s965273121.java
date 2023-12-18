import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 1;
        
        String tmp = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            String chr = String.valueOf(str.charAt(i));
            if (tmp.equals(chr)) {
                if (i == str.length() - 1) {
                    break;
                }
                tmp = chr + String.valueOf(str.charAt(i + 1));
                count++;
                i++;
            } else {
                tmp = chr;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
