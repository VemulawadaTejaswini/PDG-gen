import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String ans = "";
        for(int i = 0; i < line.length(); i++) {
            char s = line.charAt(i);
            String str = String.valueOf(s);
            if(Character.isUpperCase(s)) {
                ans += str.toLowerCase();
            }else if(Character.isLowerCase(s)) {
                ans += str.toUpperCase();
            }else {
                ans += str;
            }
        }
        System.out.println(ans);
    }
 }
