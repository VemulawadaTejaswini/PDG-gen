import java.util.*;
 
class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (('a'<=c&&c<='z') || ('A'<=c&&c<='Z')) {
                sb.append(Character.isUpperCase(c)?(char)(c+32):(char)(c-32));
            }
            else sb.append(c);
        }
        System.out.println(sb);
    }
}
