import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aLength = a.length();
        int bLength = b.length();
        int length = Math.max(aLength, bLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < aLength) {
                sb.append(a.charAt(i));
            }
            if (i < bLength){
                sb.append(b.charAt(i)); 
            }
        }
        System.out.println(sb.toString());
    }
}